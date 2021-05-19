package com.example.museum2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    adapter adapterObj;
    ArrayList<Museum> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //data!!
        dataList = new ArrayList<>();

        //name of museums and info
        dataList.add(new Museum("Louvre", "Located in Paris, France. Entrance fee £10"));
        dataList.add(new Museum("National Museum of China", "Located in Beijing, China. Entrance fee £10"));
        dataList.add(new Museum("Vatican Museums", "Located in Vatican city, Vatican. Entrance fee £10"));
        dataList.add(new Museum("Metropolitan Museum of Art", "Located in New York City, USA. Entrance fee £10"));
        dataList.add(new Museum("British Museum", "Located in London, UK. Entrance fee £10"));
        dataList.add(new Museum("Tate Modern", "Located in London, UK. Entrance fee £5"));
        dataList.add(new Museum("National Gallery", "Located in London, UK. Entrance fee £5"));
        dataList.add(new Museum("Natural History Museum", "Located in London, UK. Entrance fee £5"));
        dataList.add(new Museum("American Museum of Natural History", "Located in New York City, USA. Entrance fee £5"));
        dataList.add(new Museum("State Hermitage Museum", "Located in Saint Petersburg, Russia. Entrance fee £5"));


        RecyclerView recyclerObj = findViewById(R.id.recyclerID);
        recyclerObj.setLayoutManager(new LinearLayoutManager(this));
        adapterObj = new adapter(this, dataList);
        recyclerObj.setAdapter(adapterObj);

    }
}