package com.yf.designPattern.singleton;

public class InitSingleton {
	private static InitSingleton  singleton=new InitSingleton();
	private InitSingleton() {
	}
	public static InitSingleton  getiInstant(){
		return singleton;
	}
}
