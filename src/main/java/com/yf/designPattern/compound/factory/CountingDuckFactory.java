package com.yf.designPattern.compound.factory;

import com.yf.designPattern.compound.Quackable;
import com.yf.designPattern.compound.entrties.DuckCall;
import com.yf.designPattern.compound.entrties.MallarDuck;
import com.yf.designPattern.compound.entrties.RedheadDuck;
import com.yf.designPattern.compound.entrties.RubberDuck;
import com.yf.designPattern.compound.facade.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallarDuck());
	}

	@Override
	public Quackable createReaHeatDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
