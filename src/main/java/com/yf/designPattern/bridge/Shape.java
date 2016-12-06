package com.yf.designPattern.bridge;

public abstract class Shape {
	protected DrawApi drawApi;

	protected Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}

	public abstract void drwa();
}
