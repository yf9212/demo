package com.yf.designPattern.abstractFactory;

import com.yf.designPattern.factory.Shape;
import com.yf.designPattern.factory.ShapeType;

public class AbstractColorFactory extends  AbstractFactory{

	@Override
	Color getColor(ColorType colorType) {
		return ColorFactory.getColor(colorType);
	}

	@Override
	Shape getShape(ShapeType shapeType) {
		return null;
	}

}
