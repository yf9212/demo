package com.yf.designPattern.prototype;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("draw  a  square");
	}

	public Square() {
		type="square";
	}
}
