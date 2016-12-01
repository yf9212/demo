package com.yf.designPattern.abstractFactory;

import com.yf.designPattern.factory.ShapeType;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory colorFactory= FactoryProducer.getFactory("color");
		colorFactory.getColor(ColorType.green).fill();
		AbstractFactory shapeFactory= FactoryProducer.getFactory("shape");
		shapeFactory.getShape(ShapeType.circel).draw();
	}
}
