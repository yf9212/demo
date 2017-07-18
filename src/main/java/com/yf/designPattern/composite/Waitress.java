package com.yf.designPattern.composite;

public class Waitress {
	MenuComponent menuComponent;

	public Waitress(MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}

	public void print() {
		menuComponent.print();
	}
}
