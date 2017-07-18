package com.yf.designPattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	private List<MenuComponent> components = new ArrayList<MenuComponent>();

	private String name;

	private String description;

	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	public void add(MenuComponent menuComponent) {
		components.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		components.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return components.get(i);
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(components.iterator());
	}

	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		Iterator<MenuComponent> iterator = components.iterator();
		while (iterator.hasNext()) {
			MenuComponent component = iterator.next();
			component.print();
		}
	}

}
