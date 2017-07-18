package com.yf.designPattern.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] items;
	int postion;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		if (postion >= items.length || items[postion] == null) {
			return false;
		}
		return true;
	}

	public MenuItem next() {
		MenuItem menuItem = items[postion];
		postion = postion + 1;
		return menuItem;
	}

	public void remove() {
		if (postion <= 0) {

		}
		if (items[postion - 1] != null) {
			for (int i = postion - 1; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}

	}

}
