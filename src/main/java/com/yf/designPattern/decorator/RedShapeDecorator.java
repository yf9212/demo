package com.yf.designPattern.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	@Override
	public void draw() {
		shape.draw();
		setRedColor();
	}
	private void setRedColor() {
		System.out.println("border color:red");
	}

}
