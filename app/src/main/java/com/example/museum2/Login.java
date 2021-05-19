package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
    String username, password;
    EditText test1, test2;

    Button loginbtn, registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        test1 = (EditText)findViewById(R.id.usernameentered);
        test2 = (EditText) findViewById(R.id.passwordentered);
        registerbtn = findViewById(R.id.registerbtn);
        loginbtn = findViewById(R.id.loginbtn);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = test1.getText().toString();
                password = test2.getText().toString();
                if (username.equals("admin") && password.equals("admin")) {
                        Intent i = new Intent(Login.this, MainActivity.class);
                        startActivity(i);
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Incorrect username / password";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }

        });
    }

    public void gotoregister(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }




}