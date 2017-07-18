package com.yf.designPattern.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String name;

	private String description;

	private double price;

	private boolean vegetarian;

	public MenuItem(String name, String description, double price, boolean vegetarian) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.println("(v)");
		}
		System.out.println("," + getPrice());
		System.out.println(" ---" + getDescription());
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator<MenuComponent>();
	}

}
