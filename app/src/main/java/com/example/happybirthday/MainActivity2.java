package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public TextView userName;
    MediaPlayer mediaPlayer =new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        userName=findViewById(R.id.textView2);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        userName.setText(username);
        mediaPlayer = MediaPlayer.create(this, R.raw.mp3birthday);
        mediaPlayer.start();
    }
}