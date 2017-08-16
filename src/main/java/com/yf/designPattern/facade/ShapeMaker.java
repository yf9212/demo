package com.yf.designPattern.facade;

public class ShapeMaker {
	private Shape circle;
	private Shape ractangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		ractangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		ractangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
