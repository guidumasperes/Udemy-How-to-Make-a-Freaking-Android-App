package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button workHistoryButton;
    Button callMeButton;
    Button emailMeButton;
    Button schoolHistoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = (Button) findViewById(R.id.workHistoryButton);
        callMeButton = (Button) findViewById(R.id.callMeButton);
        emailMeButton = (Button) findViewById(R.id.emailMeButton);
        schoolHistoryButton = (Button) findViewById(R.id.schoolHistoryButton);

        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //When clicking on Work History button go to Work History activity
                Intent goToWorkHistoryActivity = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goToWorkHistoryActivity);
            }
        });

        callMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Call to my phone number
                Uri myPhoneNum = Uri.parse("tel:912546780");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, myPhoneNum);
                startActivity(callIntent);
            }
        });

        emailMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Send an e-mail to me
                 Intent emailIntent = new Intent(Intent.ACTION_SEND);
                 emailIntent.setType("plain/text");
                 emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"randomemail@gmail.com"});
                 emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Resume app");
                 startActivity(emailIntent);
            }
        });

        schoolHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSchoolHistoryActivity = new Intent(getApplicationContext(), SchoolHistoryActivity.class);
                startActivity(goToSchoolHistoryActivity);
            }
        });
    }
}