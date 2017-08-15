package com.yf.designPattern.compound.factory;

import com.yf.designPattern.compound.Quackable;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();

	public abstract Quackable createReaHeatDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}
