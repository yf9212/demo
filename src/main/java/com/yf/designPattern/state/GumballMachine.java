package com.yf.designPattern.state;

public class GumballMachine {

	private State soldOutState;

	private State noQuarterState;

	private State hasQuarterState;

	private State soldState;

	private State winnerState;

	private State state = soldOutState;

	private int count = 0;

	public GumballMachine(int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			this.state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A  gumball  comes  rolling out the  slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}
	
	public void refill(int count){
		this.count=getCount()+count;
		this.state=this.getNoQuarterState();
	}

}
