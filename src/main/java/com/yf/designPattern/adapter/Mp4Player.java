package com.yf.designPattern.adapter;

public class Mp4Player extends AbstractAdvanceMediaPlayer {
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
