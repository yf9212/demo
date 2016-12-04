package com.yf.designPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private static Map<String, Shape> maps = new HashMap<String, Shape>();

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		maps.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		maps.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		maps.put(rectangle.getId(), rectangle);
	}
	
	public  static  Shape  getShape(String shapeId) throws CloneNotSupportedException{
		Shape shape=maps.get(shapeId);
		return  (Shape) shape.clone();
	}
}
