package com.yf.designPattern.adapter;

public class MediaPlayerAdapter implements MediaPlayer{

	private AdvacedMediaPlayer advacedMediaPlayer;
	
	public MediaPlayerAdapter(String medieType) {
		if(medieType.equalsIgnoreCase("vlc") ){
			advacedMediaPlayer = new VlcPlayer();			
	      } else if (medieType.equalsIgnoreCase("mp4")){
	    	  advacedMediaPlayer = new Mp4Player();
	      }	
	}
	
	public void play(String medieType, String fileName) {
		if(medieType.equalsIgnoreCase("vlc")){
			advacedMediaPlayer.playVlc(fileName);
	      }else if(medieType.equalsIgnoreCase("mp4")){
	    	  advacedMediaPlayer.playMp4(fileName);
	      }
	}

}
