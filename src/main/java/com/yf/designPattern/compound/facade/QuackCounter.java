package com.yf.designPattern.compound.facade;

import static com.google.common.base.Preconditions.checkNotNull;

import com.yf.designPattern.compound.Quackable;
import com.yf.designPattern.compound.observer.Observer;

public class QuackCounter implements Quackable {

	private Quackable duck;
	private static int numberOfQuacks = 0;

	public QuackCounter(Quackable quackable) {
		this.duck = checkNotNull(quackable);
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}

	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	public void notifyObserver() {
		duck.notifyObserver();
	}

}
