package com.example.administrator.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.EditText;

import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int userGuess;
    int diffGuess;
    Random r=new Random();
    private  int theNumber=r.nextInt(1000);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }







    public void onClick(View v) {



        EditText InputText = (EditText) findViewById(R.id.userGuess);
        String userInput = InputText.getText().toString();

        userGuess = Integer.parseInt(userInput);
        if ((userGuess <= 0) || (userGuess > 1000)) {
            Toast.makeText(getApplicationContext(), "Please enter a number between 1 & 1000", Toast.LENGTH_SHORT).show();



        }
        if (userGuess == theNumber) {
            Toast.makeText(getApplicationContext(), " correct  number", Toast.LENGTH_SHORT).show();
        } else if (userGuess > theNumber) {
            diffGuess = userGuess - theNumber;
            if (diffGuess <= 5)
                Toast.makeText(getApplicationContext(), "Your Guess is  too closer", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(), "Your Guess is bigger than the number ", Toast.LENGTH_SHORT).show();
        }
        if(userGuess<theNumber) {
            diffGuess = theNumber - userGuess;
            if(diffGuess<=5)
                Toast.makeText(getApplicationContext(), "Your Guess is too closer", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(), "Your Guess is smaller than the number ", Toast.LENGTH_SHORT).show();
        }
    }
}