package com.example.shashank.dbzhangmanmultiplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                nextactivity();
                finish();
            }
        },3000);
    }

    public void nextactivity()
    {
        Intent intent = new Intent(this,Activity1.class);
        startActivity(intent);
    }


}
