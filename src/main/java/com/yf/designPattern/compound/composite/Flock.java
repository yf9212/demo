package com.yf.designPattern.compound.composite;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;
import com.yf.designPattern.compound.Quackable;
import com.yf.designPattern.compound.observer.Observer;

public class Flock implements Quackable {

	private List<Quackable> quackables = Lists.newArrayList();

	public void add(Quackable quackable) {
		quackables.add(checkNotNull(quackable));
	}

	public void quack() {
		Iterator<Quackable> iterator = quackables.iterator();
		while (iterator.hasNext()) {
			iterator.next().quack();
		}
	}

	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator=quackables.iterator();
		while(iterator.hasNext()){
			iterator.next().registerObserver(observer);
		}
	}

	public void notifyObserver() {
	}

}
