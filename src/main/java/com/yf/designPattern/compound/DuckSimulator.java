package com.yf.designPattern.compound;

public class DuckSimulator {
	void simulator() {
		Quackable mallardDuck = new MallarDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		System.out.println("\n Duck  Simulator");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}

	void simulate(Quackable quackable) {
		quackable.quack();
	}
}
