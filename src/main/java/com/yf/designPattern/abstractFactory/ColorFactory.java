package com.yf.designPattern.abstractFactory;

public class ColorFactory {
	
	public static Color getColor(ColorType colorType) {
		if (colorType == null) {
			return null;
		}
		switch (colorType) {
		case red:
			return new Red();
		case green:
			return new Green();
		case blue:
			return new Blue();
		default:
			return null;
		}
	}
}
