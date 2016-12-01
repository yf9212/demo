package com.yf.designPattern.singleton;
/**
 * 双重锁检查，对象为null时，加锁对象
 * @author yang.f3
 *
 */
public class DoubleCheckSingleton {
	private  volatile  static  DoubleCheckSingleton singleton;
	private DoubleCheckSingleton() {
	}
	
	public static DoubleCheckSingleton getinstance(){
		if(singleton==null){
			synchronized(DoubleCheckSingleton.class){
				if(singleton==null){
					singleton=new DoubleCheckSingleton();
				}
			}
		}
		return  singleton;
	}
}
