package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Payment extends AppCompatActivity {

    int total;
    ///List totalitems = new ArrayList();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Intent intent = getIntent();

        int totalprice = intent.getIntExtra("totalprice", 0);
        ArrayList<String> nameofitems = getIntent().getStringArrayListExtra("nameofitems");
        total = totalprice;
        listView= (ListView)findViewById(R.id.listview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nameofitems);
        listView.setAdapter(arrayAdapter);

        ((TextView) findViewById(R.id.total2)).setText("Total price = £" + totalprice);
    }

    public void  function (){
        ((TextView) findViewById(R.id.total2)).setText("Total price = £" + total);
    }

    public void proceedtopayment1(View view) {
        Intent intent = new Intent(this, Calculator.class);
        intent.putExtra("total", total);
        startActivity(intent);
    }
}