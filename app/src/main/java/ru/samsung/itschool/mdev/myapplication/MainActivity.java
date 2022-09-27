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
    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPlay(View v) {
        if(v.getId() == R.id.start) {
            mp = MediaPlayer.create(this, R.raw.canon);
            mp.start();
        } else {
            mp.stop();
            mp = null;
        }
    }


}