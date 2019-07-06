package com.yf.guava;

import com.google.common.base.Function;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.CheckedFuture;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.yf.guava.execute.GuavaException;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static com.google.common.base.Preconditions.checkNotNull;

public class ListenableFutureTest {

	ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(5));

	@Test
	public void listenableFutureTest() {
		ListenableFuture<User> future = service.submit(new Callable<User>() {
			public User call() throws Exception {
				Random random = new Random(System.currentTimeMillis());
				int value = random.nextInt(10);
				System.out.println(value);
				if (value < 5) {
					throw new RuntimeException("异常");
				}
				return new User(1, "李四");
			}
		});
		Futures.addCallback(future, new FutureCallback<User>() {
			public void onSuccess(User result) {
				System.out.println(result);
			}

			public void onFailure(Throwable t) {
				System.out.println(t.getMessage());
			}
		});
	}

	@Test
	public void listenableFutureTaskTest() throws InterruptedException, ExecutionException, TimeoutException {
		Stopwatch stopwatch = Stopwatch.createStarted();
		ListenableFutureTask<User> futureTask = ListenableFutureTask.create(new Callable<User>() {
			public User call() throws Exception {
				return new User(1, "李四");
			}
		});
		futureTask.run();
		User user = futureTask.get(4, TimeUnit.SECONDS);
		System.out.println(user);
		stopwatch.stop();
		long times = stopwatch.elapsed(TimeUnit.MILLISECONDS);
		System.out.println(times);
	}

	@Test
	public void asyncListenableFutureChain() throws InterruptedException, ExecutionException {
		ListenableFuture<String> input = service.submit(new Callable<String>() {
			public String call() throws Exception {
				Thread.sleep(5000);
				return "王五";
			}
		});

		AsyncFunction<String, User> function = new AsyncFunction<String, User>() {
			public ListenableFuture<User> apply(String input) throws Exception {
				SettableFuture<User> future = SettableFuture.create();
				future.set(new User(1, input));
				return future;
			}
		};
		ListenableFuture<User> future = Futures.transform(input, function, Executors.newFixedThreadPool(5));
		User user = future.get();
		System.out.println(user);
	}

	@Test
	public void listenableFutureChain() throws InterruptedException, ExecutionException {
		ListenableFuture<String> input = service.submit(new Callable<String>() {
			public String call() throws Exception {
				return "王五";
			}
		});
		Function<String, User> function = new Function<String, User>() {
			public User apply(String input) {
				return new User(1, input);
			}

		};
		ListenableFuture<User> future = Futures.transform(input, function, Executors.newFixedThreadPool(5));
		User user = future.get();
		System.out.println(user);
	}

	/**
	 * 执行多个ListenableFuture,如果其中一个异常，整体异常
	 * 
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	@Test
	public void allAsList() throws InterruptedException, ExecutionException {
		List<ListenableFuture<User>> futures = Lists.newArrayList();
		futures.add(service.submit(new Callable<User>() {
			public User call() throws Exception {
				return new User(1, "张三");
			}
		}));

		futures.add(service.submit(new Callable<User>() {

			public User call() throws Exception {
				return new User(2, "李四");
			}
		}));

		futures.add(service.submit(new Callable<User>() {

			public User call() throws Exception {
				return new User(2, "李四");
			}
		}));

		futures.add(service.submit(new Callable<User>() {

			public User call() throws Exception {
				throw new Exception("错误");
			}
		}));

		ListenableFuture<List<User>> future = Futures.allAsList(futures);

		List<User> users = future.get();
		System.out.println(users);
	}

	class createUserCallable implements Callable<User> {

		private String userName;

		public createUserCallable(String userName) {
			this.userName = checkNotNull(userName);
		}

		public User call() throws Exception {
			Thread.sleep(1000);
			return new User(new Random().nextInt(10000), userName);
		}

	}

	/**
	 * 执行多个ListenableFuture,如果其中一个异常，异常位置返回null
	 * 
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	@Test
	public void successfulAsList() throws InterruptedException, ExecutionException {

		try {
			List<ListenableFuture<User>> futures = Lists.newArrayList();
			for (int i = 0; i < 20; i++) {
				futures.add(service.submit(new createUserCallable("张三" + i)));
			}
			futures.add(service.submit(new Callable<User>() {

				public User call() throws Exception {
					throw new Exception("错误");
				}
			}));
			ListenableFuture<List<User>> future = Futures.successfulAsList(futures);

			List<User> users = future.get();
			System.out.println(users);
		} finally {
			service.shutdown();
		}
	}

	/**
	 * 自定义异常输出
	 * @throws GuavaException
	 */
	public void checkFuture() throws GuavaException {
		CheckedFuture<User, GuavaException> checkedFuture = Futures.makeChecked(service.submit(new Callable<User>() {

			public User call() throws Exception {
				return null;
			}
		}), new Function<Exception, GuavaException>() {

			public GuavaException apply(Exception input) {
				return new GuavaException(input);
			}

		});
		checkedFuture.checkedGet();

	}

}
