package com.yf.guava.service;

import com.google.common.util.concurrent.AbstractIdleService;
import com.google.common.util.concurrent.Service;

import junit.framework.TestCase;

public class AbstractIdleServiceTest extends ServiceTest {
	public static class functionalTest extends TestCase {
		private static class DefaultService extends AbstractIdleService {
			@Override
			protected void startUp() throws Exception {
				System.out.println("startUp...");
			}

			@Override
			protected void shutDown() throws Exception {
				System.out.println("shutDown...");
			}
		}

		public void testserviceStartStop() {
			AbstractIdleService service = new DefaultService();
			service.startAsync().awaitRunning();
			assertEquals(Service.State.RUNNING, service.state());
			service.stopAsync().awaitTerminated();
			assertEquals(Service.State.TERMINATED, service.state());
		}

		public void testStart_failed() throws Exception {
			final Exception exception = new Exception("deliberate");
			AbstractIdleService service = new DefaultService() {
				protected void startUp() throws Exception {
					throw exception;
				}
			};
			try {
				service.startAsync().awaitRunning();
				fail();
			} catch (RuntimeException e) {
				assertSame(exception, e.getCause());
			}
			assertEquals(Service.State.FAILED, service.state());
		}

		public void testStop_failed() throws Exception {
			final Exception exception = new Exception("deliberate");
			AbstractIdleService service = new DefaultService() {
				protected void shutDown() throws Exception {
					throw exception;
				}
			};
			service.startAsync().awaitRunning();
			try {
				service.stopAsync().awaitTerminated();
				fail();
			} catch (RuntimeException e) {
				assertSame(exception, e.getCause());
			}
			assertEquals(Service.State.FAILED, service.state());
		}
	}
	
	

}
