package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }
    public void loginfunction(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void registerfunction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Sorry we currently don't accept any registrations";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}