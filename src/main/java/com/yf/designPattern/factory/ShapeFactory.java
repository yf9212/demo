package com.yf.designPattern.factory;

public class ShapeFactory {
	public  static Shape  getShape(ShapeType shapeType){
		if(shapeType==null){
			return null;
		}
		switch (shapeType) {
		case rectangle:
			return new Rectangle();
		case square:
			return new Square();
		case circel:
			return  new Circle();
		default:
			return null;
		}
	}
}
