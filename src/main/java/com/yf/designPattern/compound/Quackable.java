package com.yf.designPattern.compound;

import com.yf.designPattern.compound.observer.QuackObservable;

public interface Quackable extends QuackObservable{
	public void  quack();
}
