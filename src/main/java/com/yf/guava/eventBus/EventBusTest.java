package com.yf.guava.eventBus;

import java.util.concurrent.Executors;

import org.junit.Test;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import com.yf.guava.User;

public class EventBusTest {
	
	@Test
	public void eventBus(){
		AsyncEventBus asyncEventBus=new AsyncEventBus(Executors.newFixedThreadPool(5));
		asyncEventBus.register(new Object(){
			
			@AllowConcurrentEvents
			@Subscribe
			public void ListenerInteger(Integer object){
				System.out.printf("value for Integer: %s", object);
			}
			
			@AllowConcurrentEvents
			@Subscribe
			public void ListenerLong(Long object){
				System.out.printf("value for Long: %s", object);
			}
			
			@AllowConcurrentEvents
			@Subscribe
			public void ListenerDouble(Double object){
				System.out.printf("value for Double: %s", object);
			}
			
			@AllowConcurrentEvents
			@Subscribe
			public void ListenerUser(User object){
				System.out.printf("value for User: %s", object);
			}
			
			@AllowConcurrentEvents
			@Subscribe
			public void ListenerMath(Number object){
				System.out.printf("value for Number: %s", object);
			}
		});
		
		asyncEventBus.post(new User(1, "李四"));
		asyncEventBus.post(1);
		asyncEventBus.post(1.0d);
		asyncEventBus.post(1l);
	}
}
