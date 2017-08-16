package com.yf.designPattern.abstractFactory;

import com.yf.designPattern.abstractFactory.color.Blue;
import com.yf.designPattern.abstractFactory.color.Color;
import com.yf.designPattern.abstractFactory.color.Green;
import com.yf.designPattern.abstractFactory.color.Red;

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
