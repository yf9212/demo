package com.yf.designPattern.prototype;

public class Rectangle extends  Shape{

	@Override
	public void draw() {
		System.out.println("draw a   rectangle");
	}
	public Rectangle() {
		type="rectangle";
	}
}
