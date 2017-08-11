package com.yf.guava.invokable;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;

import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;

public class InvokableTest {
	@Test
	public void methods() throws NoSuchMethodException, SecurityException {
		Method getMethod = List.class.getMethod("get", int.class);
		Invokable<List<String>, ?> invokable = new TypeToken<List<String>>() {
			private static final long serialVersionUID = 1L;
		}.method(getMethod);
		System.out.println(invokable.isPublic());
	}
}
