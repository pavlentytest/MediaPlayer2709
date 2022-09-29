package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /*
    Глобально
    Поля класса
     */
    public MediaPlayer mp; // null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPlay(View v) {
        if(v.getId() == R.id.start) { // когда нажали на Start
            if(mp == null) {
                mp = MediaPlayer.create(this, R.raw.canon);
                mp.start();
            }  else {
                if(mp.isPlaying()) { // true or false
                    mp.pause();
                } else {
                    mp.start(); // continue playing
                }
            }
        } else { // когда нажали на Stop
            mp.stop();
            mp = null;
        }
    }


}