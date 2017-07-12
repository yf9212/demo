package com.yf.designPattern.command;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	public void execute() {
		 this.garageDoor.up();
		 this.garageDoor.lightOn();
	}

}
