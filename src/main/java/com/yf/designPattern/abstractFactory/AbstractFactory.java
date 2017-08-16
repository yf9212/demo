package com.yf.designPattern.abstractFactory;

import com.yf.designPattern.abstractFactory.color.Color;
import com.yf.designPattern.factory.Shape;
import com.yf.designPattern.factory.ShapeType;

public abstract class AbstractFactory {
	abstract  Color  getColor(ColorType colorType);
	abstract Shape getShape(ShapeType shapeType);
}
