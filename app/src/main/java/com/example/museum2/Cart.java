package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {

    int museumprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Intent intent = getIntent();
        int price = intent.getIntExtra("price", 0);
        ((TextView)findViewById(R.id.store1)).setText(
                "Ticket = £" + price
        );
        museumprice = price;
    }

    List nameofitems = new ArrayList();
    int totalprice;

    public void addtototalprice1 (View v){
            totalprice = totalprice + museumprice;
            nameofitems.add("Ticket");
            ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice2 (View v){
        totalprice = totalprice + 1;
        nameofitems.add("Tea = £1");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice3 (View v){
        totalprice = totalprice + 1;
        nameofitems.add("Water= £1");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice4 (View v){
        totalprice = totalprice + 2;
        nameofitems.add("Coffee = £2");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice5 (View v){
        totalprice = totalprice + 2;
        nameofitems.add("Flatbread = £2");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice6 (View v){
        totalprice = totalprice + 2;
        nameofitems.add("Sandwich = £2");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice7 (View v){
        totalprice = totalprice + 2;
        nameofitems.add("Salad = £2");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice8 (View v){
        totalprice = totalprice + 2;
        nameofitems.add("Sweet roll = £2");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice9 (View v){
        totalprice = totalprice + 2;
        nameofitems.add("Coaster = £2");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice10 (View v){
        totalprice = totalprice + 10;
        nameofitems.add("Shirt = £10");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice11 (View v){
        totalprice = totalprice + 5;
        nameofitems.add("Hat = £5");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice12 (View v){
        totalprice = totalprice + 5;
        nameofitems.add("Snow globe = £5");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice13 (View v){
        totalprice = totalprice + 5;
        nameofitems.add("Key chain = £5");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice14 (View v){
        totalprice = totalprice + 5;
        nameofitems.add("Bottle = £5");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void addtototalprice15 (View v){
        totalprice = totalprice + 5;
        nameofitems.add("Mug = £5");
        ((TextView) findViewById(R.id.total1)).setText("Total price = £" + totalprice);
    }
    public void proceedtobuy1(View view) {
        Intent intent = new Intent(this, Payment.class);
        intent.putExtra("totalprice", totalprice);
        intent.putStringArrayListExtra("nameofitems", (ArrayList<String>) nameofitems);
        startActivity(intent);
    }




}