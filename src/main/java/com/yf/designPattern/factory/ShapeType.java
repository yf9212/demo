package com.yf.designPattern.factory;

public enum ShapeType {
	
	rectangle(1,"长方形"),
	circel(2,"圆"),square(3,"square");
	
	private Integer type;
	private String name;
	
	private ShapeType(Integer type,String name){
		this.type=type;
		this.name=name;
	}
	
	public  Integer getType(){
		return this.type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String  getName(Integer type){
		ShapeType[] types= ShapeType.values();
		for (ShapeType shapeType : types) {
			if(shapeType.type==type){
				return shapeType.name;
			}
		}
		return null;
	}
}
