package com.yf.designPattern.abstractFactory;

import com.yf.designPattern.abstractFactory.color.Color;
import com.yf.designPattern.factory.Shape;
import com.yf.designPattern.factory.ShapeFactory;
import com.yf.designPattern.factory.ShapeType;

public class AbstractShapeFactory extends  AbstractFactory{

	@Override
	Color getColor(ColorType colorType) {
		return null;
	}

	@Override
	Shape getShape(ShapeType shapeType) {
		return ShapeFactory.getShape(shapeType);
	}

}
