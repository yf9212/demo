package com.yf.designPattern.compound;

import com.yf.designPattern.compound.adapter.GooseAdapter;
import com.yf.designPattern.compound.composite.Flock;
import com.yf.designPattern.compound.entrties.Goose;
import com.yf.designPattern.compound.factory.AbstractDuckFactory;
import com.yf.designPattern.compound.factory.CountingDuckFactory;

public class DuckSimulator {
	void simulator(AbstractDuckFactory duckFactory) {
		
		
		Quackable redheadDuck =duckFactory.createReaHeatDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck=new GooseAdapter(new Goose());
		
		System.out.println("\n Duck  Simulator:With Composite - Flocks");
		Flock flockOfDucks=new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards=new Flock();
		
		Quackable mallardOne =duckFactory.createMallardDuck();
		Quackable mallardTwo =duckFactory.createMallardDuck();
		Quackable mallardThree =duckFactory.createMallardDuck();
		Quackable mallardFour =duckFactory.createMallardDuck();
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("Duck  simulator:Whole  Flock  Simulation");
		
		Quackologist quackologist=new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		
		
		
		simulate(flockOfDucks);
		
		System.out.println("Duck  simulator:Mallard  Flock  Simulation");
		simulate(flockOfMallards);
	}

	void simulate(Quackable quackable) {
		quackable.quack();
	}
	public static void main(String[] args) {
		DuckSimulator simulator=new DuckSimulator();
		AbstractDuckFactory factory=new CountingDuckFactory();
		simulator.simulator(factory);
	}
}
