package com.example.shashank.dbzhangmanmultiplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    String mword;

    int mfailcounter = 0;

    int mguessedletters = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        getSupportActionBar().hide();

        String wordsent = getIntent().getStringExtra("WORD_IDENTIFIER");

         mword=wordsent.toUpperCase();
        createtextviews(wordsent.toUpperCase());

    }

    public void introduceLetter(View v){

        EditText myEditText = (EditText) findViewById(R.id.editletter);

        String letter = myEditText.getText().toString();

        myEditText.setText("");


        if(letter.length() == 1) {
            checkLetter(letter.toUpperCase());

        }else{
            Toast.makeText(this,"Please Introduce A Letter",Toast.LENGTH_SHORT).show();

        }


    }

    public void checkLetter(String introducedLetter){

        char charIntroduced = introducedLetter.charAt(0);

        boolean letterguessed = false ;

        for( int i = 0 ; i < mword.length();i++){

            char charfromtheword = mword.charAt(i);

            if (charfromtheword ==  charIntroduced){

                letterguessed = true;

                 showlettersatindex(i,charIntroduced);

                mguessedletters ++ ;
            }
        }

        if(letterguessed == false){

            letterfailed(Character.toString(charIntroduced));
        }

        if(mguessedletters == mword.length()){

            finish();

            Intent myintent1 = new Intent(this,Activity4.class);
            startActivity(myintent1);

        }

    }


    public void createtextviews(String word){

        LinearLayout layout= (LinearLayout) findViewById(R.id.layoutletters);

        for(int i=0 ; i<word.length();i++){

            TextView newtextview = (TextView) getLayoutInflater().inflate(R.layout.textview,null);

            layout.addView(newtextview);

        }


    }


    public void letterfailed(String letterfailed){

        TextView textviewfailed = (TextView) findViewById(R.id.textView6);

        String previousfail = textviewfailed.getText().toString();

        textviewfailed.setText(previousfail+letterfailed);

         mfailcounter++;

        ImageView imageview = (ImageView) findViewById(R.id.imageView2);

        if(mfailcounter == 1){
            imageview.setImageResource(R.drawable.ptwo);
        }else if (mfailcounter == 2){
            imageview.setImageResource(R.drawable.pthree);
        }else if (mfailcounter == 3){
            imageview.setImageResource(R.drawable.pfour);
        }else if (mfailcounter == 4){
            imageview.setImageResource(R.drawable.pfive);
        }else if (mfailcounter == 5){
            imageview.setImageResource(R.drawable.psix);
        }else if(mfailcounter == 6){
            Intent myintent2 = new Intent(this,Activity5.class);
            startActivity(myintent2);
        }

    }


     public void showlettersatindex(int position,char letterguessed){

         LinearLayout layoutletter = (LinearLayout) findViewById(R.id.layoutletters);

         TextView textview = (TextView) layoutletter.getChildAt(position);

         textview.setText(Character.toString(letterguessed));

     }


}





