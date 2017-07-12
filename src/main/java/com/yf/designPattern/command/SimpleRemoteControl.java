package com.yf.designPattern.command;

public class SimpleRemoteControl {
	private Command command;

	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void  buttonWasPressed(){
		command.execute();
	}

}
