package com.yf.designPattern.singleton;

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
