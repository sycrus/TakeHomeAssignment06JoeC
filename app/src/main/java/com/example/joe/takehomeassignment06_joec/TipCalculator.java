package com.example.joe.takehomeassignment06_joec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TipCalculator extends AppCompatActivity {

    Receipt receipt = new Receipt(0.0f, 0.0f, 0.0f) ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Amount EditText
                EditText amount = (EditText) findViewById(R.id.amount_edittext);
                receipt.setAmount(Float.parseFloat(amount.getText().toString()));

                //Tax EditText
                EditText tax = (EditText) findViewById(R.id.tax_edittext);
                receipt.setTax(Float.parseFloat(tax.getText().toString()));

                //Amount EditText
                EditText tip = (EditText) findViewById(R.id.tip_edittext);
                receipt.setTip(Float.parseFloat(tip.getText().toString()));

                Intent intent = new Intent(TipCalculator.this, Display.class);

                intent.putExtra(Keys.RECEIPT, receipt);

                startActivity(intent);
            }

        });
    }
}
