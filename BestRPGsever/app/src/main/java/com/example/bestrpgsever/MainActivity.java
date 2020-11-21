package com.example.bestrpgsever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] rpgGames = new String[] {"Baldur's Gate", "Dragon Age: Origins", "Dragon's Dogma: Dark Arisen", "Gothic",
                                      "Kingdoms of Amalur: Reckoning", "Risen", "The Elder Scrolls V: Skyrim",
                                      "The Witcher 3: Wild Hunt", "Torchlight"
                                     };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> rpgGamesAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, rpgGames); //Maybe change to list_item_2 later
        listView.setAdapter(rpgGamesAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent moveToGameActivityIntent = new Intent(getBaseContext(), GameActivity.class);
        moveToGameActivityIntent.putExtra("gameName", rpgGames[i]);
        startActivity(moveToGameActivityIntent);
    }
}