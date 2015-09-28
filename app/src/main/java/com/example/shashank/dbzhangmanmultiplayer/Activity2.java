package com.example.shashank.dbzhangmanmultiplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().hide();
    }

    public void nextactivity2(View v)
    {
        EditText edittext = (EditText) findViewById(R.id.editTextWord);

        String wordtoguess = edittext.getText().toString();

        edittext.setText("");


        Intent myintent = new Intent(this,Activity3.class);

        myintent.putExtra("WORD_IDENTIFIER",wordtoguess);

        startActivity(myintent);
    }

}
