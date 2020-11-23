package com.example.bestrpgsever;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView gameNameTextView;
    TextView developersTextView;
    TextView releaseDateTextView;
    TextView publishersTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameNameTextView = (TextView) findViewById(R.id.gameNameTextView);
        developersTextView = (TextView) findViewById(R.id.developersTextView);
        releaseDateTextView = (TextView) findViewById(R.id.releaseDateTextView);
        publishersTextView = (TextView) findViewById(R.id.publishersTextView);
        imageView = (ImageView) findViewById(R.id.imageView);

        //Game Name
        String gameName = (String) getIntent().getExtras().get("gameName");
        gameNameTextView.setText(gameName);
        //Developers
        String gameDevs = (String) getIntent().getExtras().get("gameDevs");
        developersTextView.setText("Developers: " + gameDevs);
        //Release Date
        String gameRelDate = (String) getIntent().getExtras().get("gameRelDate");
        releaseDateTextView.setText("Release Date: " + gameRelDate);
        //Publishers
        String gamePub = (String) getIntent().getExtras().get("gamePub");
        publishersTextView.setText("Publisher: " + gamePub);
        //Image
        Integer gameImage = (Integer) getIntent().getExtras().get("gameImage");
        imageView.setImageResource(gameImage);
    }
}