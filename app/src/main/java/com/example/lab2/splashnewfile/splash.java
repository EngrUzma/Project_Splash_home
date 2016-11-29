package com.example.lab2.splashnewfile;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class splash extends Activity {


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    music= MediaPlayer.create(splash.this,R.raw.splash_song);
                    music.start();

                    sleep(3000);
                    if( music.isPlaying())
                    {
                        music.pause();
                    }


                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}*/
    MediaPlayer music;
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer=new Thread()
        {
            @Override            public void run() {
                try                {
                    music=MediaPlayer.create(splash.this,R.raw.splash_song);
                    music.start();
                    sleep(5000);

                }
                catch(InterruptedException e)
                {

                }
                finally {
                    Intent i=new Intent(splash.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };

        timer.start();


    }

    @Override    protected void onPause() {
        super.onPause();
        music.release();
    }
}