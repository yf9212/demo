package com.yf.designPattern.singleton;

/**
 * 只有当getInstance()方法被调用时，SingletonHolder才会去加载，从而加载其中的静态变量
 * @author yang.f3
 *
 */
public class StaticInnerClassSingleton {
	private static  class  SingletonHolder{
		private static final  StaticInnerClassSingleton SINGLETON=new StaticInnerClassSingleton(); 
	}
	private StaticInnerClassSingleton() {
	}
	
	public  static  StaticInnerClassSingleton  getInstance(){
		return  SingletonHolder.SINGLETON;
	}
}
