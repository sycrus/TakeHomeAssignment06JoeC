package com.example.joe.takehomeassignment06_joec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    public float total = 0.0f;
    public float amount = 0.0f;
    public float tax = 0.0f;
    public float tip = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        Intent intent = getIntent();
        Receipt receipt = (Receipt) intent.getSerializableExtra(Keys.RECEIPT);
        TextView text = (TextView) findViewById(R.id.display_text);
        amount = receipt.getAmount();
        tax = receipt.getTax() * amount;
        tip = receipt.getTip() * amount;

        total = amount + tax + tip;
        text.setText("Total: " + amount + "\n" +
                "Sales Tax: " + tax + "\n" +
                "Tip: " +  tip + "\n" +
                "Grand Total: " + total);
    }


}
