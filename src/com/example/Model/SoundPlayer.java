/**Namn: CirkusSet
 * Skapare: Mark Wibom, Max Moberg, Annebell Larsson, Andrea Edström, 
 * Daniel Sofinet, Maja Mercedes Boström, Alexander Moe Ditlevsen 
 * Programm: IDK12
 * Kurs: Programmering för interaktionsdesign 3: Mobila appar*/

package com.example.Model;

import java.util.HashMap;
import com.example.CirkusSetApp.R;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SoundPlayer {
	
	private MediaPlayer mp;
	private SoundPool soundPool;
	private HashMap<Integer, Integer> soundsMap;
	private int SOUND1 = 1;
	private int SOUND2 = 2;
	private int SOUND3 = 3;
	private Activity activity;
	    
	//Här tas emot en referens till den kontext som laddar ljuden, alltså aktiviteten
	public SoundPlayer(Activity _activity, boolean playMusic){
		this.activity = _activity;
		mp = MediaPlayer.create(activity, R.raw.bakgrundmusik);
		mp.setLooping(true);
		mp.setVolume(50,50);
		mp.start();			
		soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 100);
		soundsMap = new HashMap<Integer, Integer>();
		soundsMap.put(SOUND1, soundPool.load(activity, R.raw.happysoundkort, 1));
		soundsMap.put(SOUND2, soundPool.load(activity, R.raw.sadsoundkort, 2));
		soundsMap.put(SOUND3, soundPool.load(activity, R.raw.clicksound, 3));				
	}

	public void getSound(int choose){
	
		if(choose == 1) {
			soundPool.play(SOUND1, 5, 5, 1, 0, 1.0f);
		}
		else if(choose == 2) {
			soundPool.play(SOUND2, 5, 5, 1, 0, 1.0f);
		} 
		else if(choose == 3) {
			soundPool.play(SOUND3, 5, 5, 1, 0, 1.0f);
		} 
	}
	
	public void stopBackgroundMusic(){
		
		mp.stop();
		
	}
	
	public void startBackgroundMusic(){
		
		mp.start();
		
	}
}
