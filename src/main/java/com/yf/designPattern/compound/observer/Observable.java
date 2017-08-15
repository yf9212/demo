package com.yf.designPattern.compound.observer;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;

public class Observable implements 	QuackObservable{
	
	private List<Observer> observers=Lists.newArrayList(); 
	
	private QuackObservable observable;
	
	public Observable(QuackObservable observable) {
		this.observable=checkNotNull(observable);
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObserver() {
		Iterator<Observer> iterator= observers.iterator();
		while(iterator.hasNext()){
			Observer observer=	iterator.next();
			observer.update(observable);
		}
	}

}
