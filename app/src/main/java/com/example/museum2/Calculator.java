package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Calculator extends AppCompatActivity {

    Random rand = new Random();
    int bookingnumber = rand.nextInt(999999);
    int total;

    int money;
    EditText moneyinput;


    Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        moneyinput = (EditText)findViewById(R.id.enteredamount);



        Intent intent = getIntent();
        total = intent.getIntExtra("total", 0);

        ((TextView) findViewById(R.id.moneydue)).setText("£" + total);

        pay = findViewById(R.id.paybtn);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                money = Integer.valueOf(moneyinput.getText().toString());
                if (money >= total){
                    int change = money - total;
                    ((TextView) findViewById(R.id.moneydue2)).setText("£" + change);
                    ((TextView) findViewById(R.id.bookingnumbertxt )).setText("Booking number: " + bookingnumber);
                    ((TextView) findViewById(R.id.realnametxt )).setText("Full name: admin admin ");
                    Context context = getApplicationContext();
                    CharSequence text = "Payment accepted";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not enough money has been entered";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }
}