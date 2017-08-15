package com.yf.designPattern.compound;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;
import com.yf.designPattern.compound.observer.Observable;
import com.yf.designPattern.compound.observer.Observer;

public class Flock implements Quackable {

	private Observable observable;

	private List<Quackable> quackables = Lists.newArrayList();

	public Flock() {
		this.observable = new Observable(this);
	}

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
		observable.registerObserver(observer);
	}

	public void notifyObserver() {
		observable.notifyObserver();
	}

}
