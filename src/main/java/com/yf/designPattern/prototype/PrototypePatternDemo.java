package com.yf.designPattern.prototype;

public class PrototypePatternDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		ShapeCache.loadCache();
		
		Shape shape1=   ShapeCache.getShape("1");
		System.out.println(shape1.getId());
		System.out.println(shape1.getType());
	}
}
