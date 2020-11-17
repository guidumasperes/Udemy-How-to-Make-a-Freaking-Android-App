package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button workHistoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = (Button) findViewById(R.id.workHistoryButton);
        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //When clicking on Work History button go to Work History activity
                Intent goToWorkHistoryActivity = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goToWorkHistoryActivity);
            }
        });
    }
}