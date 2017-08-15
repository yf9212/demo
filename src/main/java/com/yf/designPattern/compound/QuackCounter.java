package com.yf.designPattern.compound;

import static com.google.common.base.Preconditions.checkNotNull;

import com.yf.designPattern.compound.observer.Observable;
import com.yf.designPattern.compound.observer.Observer;

public class QuackCounter implements Quackable {

	private Observable observable;

	private Quackable duck;
	private static int numberOfQuacks = 0;

	public QuackCounter(Quackable quackable) {
		this.duck = checkNotNull(quackable);
		this.observable = new Observable(this);
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObserver() {
		observable.notifyObserver();
	}

}
