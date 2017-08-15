package com.yf.designPattern.compound.observer;

/**
 * 可观察着
 * @author yang.f3
 *
 */
public interface QuackObservable {
	
	public void registerObserver(Observer observer);

	public void notifyObserver();
}
