package com.yf.designPattern.state;

import java.util.Random;

public class HasQuarterState implements State {
	
	Random random=new Random(System.currentTimeMillis());

	private GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't  insert  another quarter");
	}

	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		int winner=random.nextInt(10);
		if(winner==0 && gumballMachine.getCount()>1){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public void dispense() {
		System.out.println("No  gumball  dispensed");
	}

}
