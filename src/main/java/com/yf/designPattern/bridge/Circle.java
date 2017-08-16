package com.yf.designPattern.bridge;

public class Circle extends Shape {

	private int x, y, radius;

	public Circle(DrawApi drawApi, int x, int y, int radius) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void drwa() {
		getDrawApi().drawCircle(radius, x, y);
	}

}
