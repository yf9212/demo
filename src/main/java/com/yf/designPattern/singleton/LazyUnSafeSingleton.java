package com.yf.designPattern.singleton;

/**
 * 多个线程同时进入，能new出多个对象出来，破坏单例效果
 * @author yang.f3
 *
 */
public class LazyUnSafeSingleton {
	private static LazyUnSafeSingleton singleton;

	/**
	 * 私有构造函数，不让new出来
	 */
	private LazyUnSafeSingleton() {
	}

	public static LazyUnSafeSingleton getSingletion() {
		if (singleton == null) {
			singleton = new LazyUnSafeSingleton();
		}
		return singleton;
	}
}
