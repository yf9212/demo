package com.yf.designPattern.state;

public class SoldOutState implements State {

	@SuppressWarnings("unused")
	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("gumballs  is  soldOut,can't insert Quarter");
	}

	public void ejectQuarter() {
		System.out.println("You  haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but  there's no quarter");
	}

	public void dispense() {
		System.out.println("No  gumballs  dispensed");
	}

}
