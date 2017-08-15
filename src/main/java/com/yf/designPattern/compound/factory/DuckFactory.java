package com.yf.designPattern.compound.factory;

import com.yf.designPattern.compound.Quackable;
import com.yf.designPattern.compound.entrties.DuckCall;
import com.yf.designPattern.compound.entrties.MallarDuck;
import com.yf.designPattern.compound.entrties.RedheadDuck;
import com.yf.designPattern.compound.entrties.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallarDuck();
	}

	@Override
	public Quackable createReaHeatDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
