package com.yf.designPattern.compound.adapter;

import static com.google.common.base.Preconditions.checkNotNull;

import com.yf.designPattern.compound.Quackable;
import com.yf.designPattern.compound.entrties.Goose;
import com.yf.designPattern.compound.observer.Observable;
import com.yf.designPattern.compound.observer.Observer;

public class GooseAdapter implements Quackable {

	private Observable observable;
	
	private Goose goose;

	public GooseAdapter(Goose goose) {
		super();
		this.goose = checkNotNull(goose);
		this.observable=new Observable(this);
	}

	public void quack() {
		goose.honk();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObserver() {
		observable.notifyObserver();
	}

}
