package com.yf.designPattern.proxy;

import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean personBean;

	public OwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	public Object invoke(Object proxy, Method method, Object[] args) {
		try {
			if(method.getName().startsWith("get")){
				return  method.invoke(personBean, args);
			}else if(method.getName().equals("setHosOrNotRating")){
				throw new  IllegalAccessError();
			}else if(method.getName().startsWith("set")){
				return method.invoke(personBean, args);
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
