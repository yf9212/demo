package com.yf.designPattern.factory;

public class FactoryDemo {
	public static void main(String[] args) {
		ShapeFactory.getShape(ShapeType.circel).draw();
		ShapeFactory.getShape(ShapeType.rectangle).draw();
		ShapeFactory.getShape(ShapeType.square).draw();
	}
}
