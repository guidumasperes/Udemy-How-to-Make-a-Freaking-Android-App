package com.example.bestrpgsever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] rpgGames = new String[] {"Baldur's Gate: Enhanced Edition", "Dragon Age: Origins", "Dragon's Dogma: Dark Arisen", "Gothic",
                                      "Kingdoms of Amalur: Reckoning", "The Elder Scrolls V: Skyrim",
                                      "The Witcher 3: Wild Hunt"
                                     };
    Integer[] rpgImages = new Integer[] {R.mipmap.baldurs_gate, R.mipmap.dragon_age_origins, R.mipmap.dragons_dogma,
                                         R.mipmap.gothic, R.mipmap.kingdoms_of_amalur, R.mipmap.the_elder_scrolls,
                                         R.mipmap.the_witcher_3
                                        };
    String[] rpgGamesDevs = new String[] {"Beamdog", "BioWare", "Capcom", "Piranha Bytes",
                                          "Big Huge Games and 38 Studios", "Bethesda Game Studios",
                                          "CD PROJEKT RED"
                                         };
    String[] rpgGamesRelDate = new String[] {"16/jan/2013", "6/nov/2009", "15/jan/2016", "15/mar/2001",
                                             "7/feb/2012", "11/nov/2011",
                                             "18/mai/2015"
                                            };
    String[] rpgGamesPublisher = new String[] {"Beamdog", "EA Games", "Capcom", "THQ Nordic",
                                               "EA Games and 38 Studios", "Bethesda Softworks",
                                               "CD PROJEKT RED"
                                              };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link layout
        listView = (ListView) findViewById(R.id.listView);

        //Make the adapter
        ArrayAdapter<String> rpgGamesAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, rpgGames); //Maybe change to list_item_2 later
        listView.setAdapter(rpgGamesAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent moveToGameActivityIntent = new Intent(getBaseContext(), GameActivity.class);
        moveToGameActivityIntent.putExtra("gameName", rpgGames[i]);
        moveToGameActivityIntent.putExtra("gameDevs", rpgGamesDevs[i]);
        moveToGameActivityIntent.putExtra("gameRelDate", rpgGamesRelDate[i]);
        moveToGameActivityIntent.putExtra("gamePub", rpgGamesPublisher[i]);
        moveToGameActivityIntent.putExtra("gameImage", rpgImages[i]);
        startActivity(moveToGameActivityIntent);
    }
}