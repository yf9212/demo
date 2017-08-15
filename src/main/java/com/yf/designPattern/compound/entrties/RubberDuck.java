package com.yf.designPattern.compound.entrties;

import com.google.common.base.Objects;
import com.yf.designPattern.compound.Quackable;
import com.yf.designPattern.compound.observer.Observable;
import com.yf.designPattern.compound.observer.Observer;

public class RubberDuck implements Quackable {
	private Observable observable;
	
	public RubberDuck() {
		this.observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Squeak");
		notifyObserver();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObserver() {
		observable.notifyObserver();
	}

	@Override
	public String toString() {
		return Objects.toStringHelper("rubberDuck").toString();
	}
}
