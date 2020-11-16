package com.example.calcmytip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declare properties
    TextView tipTotalTextView;
    TextView totalTextView;
    EditText inputBillEditText;
    EditText customTipEditText;
    Button badButton;
    Button okayButton;
    Button goodButton;
    Button confirmCustomTipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect properties to layout elements
        tipTotalTextView = (TextView) findViewById(R.id.tipTotal);
        totalTextView = (TextView) findViewById(R.id.total);
        inputBillEditText = (EditText) findViewById(R.id.inputBill);
        customTipEditText = (EditText) findViewById(R.id.customTip);
        badButton = (Button) findViewById(R.id.bad);
        okayButton = (Button) findViewById(R.id.okay);
        goodButton = (Button) findViewById(R.id.good);
        confirmCustomTipButton = (Button) findViewById(R.id.confirmCustomTip);

        //Add interactions with buttons and stuff
        badButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipCalculator(0.1);
            }
        });
        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipCalculator(0.15);
            }
        });
        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipCalculator(0.2);
            }
        });
        confirmCustomTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double customTip = Double.valueOf(customTipEditText.getText().toString()) / 100.0;
                tipCalculator(customTip);
            }
        });
    }
    void tipCalculator(Double tipPercentage) {
        //Get the number from the input
        Double billTotal = Double.valueOf(inputBillEditText.getText().toString());
        //Determine the tip
        Double tipTotal = billTotal * tipPercentage;
        //Display the tip
        tipTotalTextView.setText("Tip - $" + String.format("%.2f", tipTotal));
        //Determine the total
        Double total = tipTotal + billTotal;
        //Display the total
        totalTextView.setText("Total - $" + String.format("%.2f", total));
    }
}