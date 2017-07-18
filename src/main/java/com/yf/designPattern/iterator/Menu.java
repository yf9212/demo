package com.yf.designPattern.iterator;

import java.util.Iterator;

public interface Menu {
	public <T>  Iterator<T> createIterator();
}
