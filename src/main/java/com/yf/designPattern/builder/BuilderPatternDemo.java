package com.yf.designPattern.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder builder=new MealBuilder();
		Meal nonVegMeal=  builder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Show cost:" +nonVegMeal.getCost());
		
		Meal vegMeal=  builder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Show cost:" +vegMeal.getCost());
		System.exit(0);
	}
}
