package com.yf.designPattern.compound;

import com.yf.designPattern.compound.observer.Observer;
import com.yf.designPattern.compound.observer.QuackObservable;

public class Quackologist implements  Observer{

	public void update(QuackObservable duck) {
		System.out.println("Quackologist: "+ duck  +"just  quacked.");
	}

}
