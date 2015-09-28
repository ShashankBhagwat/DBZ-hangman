package com.example.shashank.dbzhangmanmultiplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        getSupportActionBar().hide();
    }

    public void nextactivity4(View v)
    {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

}
