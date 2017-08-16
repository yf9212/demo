package com.yf.designPattern.bridge;

import static com.google.common.base.Preconditions.checkNotNull;

public abstract class Shape {
	private DrawApi drawApi;

	protected Shape(DrawApi drawApi) {
		this.drawApi = checkNotNull(drawApi);
	}

	public DrawApi getDrawApi() {
		return drawApi;
	}

	public abstract void drwa();
}
