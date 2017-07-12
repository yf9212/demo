package com.yf.designPattern.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl control=new SimpleRemoteControl();
		Light light=new Light();
		Command command=new LightOnCommand(light);
		control.setCommand(command);
		control.buttonWasPressed();
	}
}
