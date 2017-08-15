package com.yf.designPattern.compound.observer;

/**
 * 可被观察着
 * @author yang.f3
 *
 */
public interface QuackObservable {
	
	/**
	 * 注册到观察着
	 * @param observer
	 */
	public void registerObserver(Observer observer);

	/**
	 *变动后，告诉观察着，变化了。
	 */
	public void notifyObserver();
}
