package com.yf.designPattern.proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {

	Object invoke(Object proxy, Method method, Object[] args);

}
