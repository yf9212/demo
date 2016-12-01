package com.yf.designPattern.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType){
		if(factoryType==null){
			return null;
		}
		if("color".equalsIgnoreCase(factoryType)){
			return new AbstractColorFactory();
		}else if("shape".equalsIgnoreCase(factoryType)){
			return new AbstractShapeFactory();
		}else{
			return null;
		}
		
	}
}
