package com.yf.designPattern.abstractFactory;

public enum ColorType {
	
	red(1,"红"),
	blue(2,"蓝"),
	green(3,"绿");
	
	private Integer type;
	private String name;
	
	private ColorType(Integer type,String name){
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
		ColorType[] types= ColorType.values();
		for (ColorType shapeType : types) {
			if(shapeType.type==type){
				return shapeType.name;
			}
		}
		return null;
	}
}
