package com.yf.designPattern.state;

public class SoldState implements State {

	private GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait,we're  already  giving you a gumball");
	}

	public void ejectQuarter() {
		System.out.println("Sorry ,you are already the  crank");
	}

	public void turnCrank() {
		System.out.println("Turing twice  doesn't  get you another  bumball");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("0ops,out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
