package com.yf.designPattern.adapter;

public class VlcPlayer extends AbstractAdvanceMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}
}
