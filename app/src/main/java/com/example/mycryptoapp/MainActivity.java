package com.example.mycryptoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText screen;
    ImageButton callBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        callBTN = findViewById(R.id.callBTN);


        callBTN.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View view){
                call();
            }
        };
    }


        public void call(){
        String number =screen.getText().toString();
        if (number.trim().length()>0){

            String i = "tel"+ number;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(i)));

        }else {
            Toast.makeText(MainActivity.this,"Please enter a valid Phone Number").show();


        }



        }


    public void InputNum(View view){
        String number = screen.getText().toString();

        switch (view.getId()){

            case R.id.oneBTN:
                number += "1";
                break;
            case R.id.twoBTN:BTN:
                number += "2";
                break;
            case R.id.threeBTN:BTN:
                number += "3";
                break;
            case R.id.fourBTN:BTN:
                number += "4";
                break;
            case R.id.fiveBTN:BTN:
                number += "5";
                break;
            case R.id.sixBTN:BTN:
                number += "6";
                break;
            case R.id.sevenBTN:BTN:
                number += "7";
                break;
            case R.id.eightBTN:BTN:
                number += "8";
                break;
            case R.id.nineBTN:BTN:
                number += "9";
                break;
            case R.id.zeroBTN:
                number += "0";
                break;
            case R.id.star:
                number += "*";
                break;
            case R.id.hash:
                number += "#";
                break;





        }






    }


}