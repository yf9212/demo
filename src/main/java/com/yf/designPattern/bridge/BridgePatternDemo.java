package com.yf.designPattern.bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Circle circle=new Circle(new  RedCircle(), 10, 100, 5);
		circle.drwa();
	}
}
