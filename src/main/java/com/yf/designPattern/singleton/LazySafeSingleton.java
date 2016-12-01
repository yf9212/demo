package com.yf.designPattern.singleton;
/**
 * 每次获取对象时，保证只能有一个线程获取，效率较低，对高并发性能影响比较大
 * @author yang.f3
 *
 */
public class LazySafeSingleton {
	private static LazySafeSingleton singleton;

	/**
	 * 私有构造函数，不让new出来
	 */
	private LazySafeSingleton() {
	}

	public static  synchronized LazySafeSingleton getSingletion() {
		if (singleton == null) {
			singleton = new LazySafeSingleton();
		}
		return singleton;
	}
}
