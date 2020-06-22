package com.example.emre.bodymassindexcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class firstScreen extends AppCompatActivity {

    //Convert strings to double values and evaluate BMI value
    double tempWeight, tempHeight, BMI;
    String stringBMI = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        //Get data from User
        final EditText weight       = (EditText) findViewById(R.id.weight);
        final EditText height       = (EditText) findViewById(R.id.height);
        final TextView weightText   = (TextView) findViewById(R.id.weightText);
        final TextView heightText   = (TextView) findViewById(R.id.heightText);
        final Button buttonCalc     = (Button) findViewById(R.id.buttonCalc);



        //Set listener for button when clicked
        buttonCalc.setOnClickListener(new View.OnClickListener() {

            //Calculate BMI as get button is clicked
            @Override
            public void onClick(View v) {

                try {
                    tempWeight = new Double(weight.getText().toString());
                    tempHeight = new Double(height.getText().toString());
                } catch (NumberFormatException e) {
                    tempWeight = 0;
                    tempHeight = 0;
                };

                //Calculate Body Mass Index
                //BMI = (tempWeight / (tempHeight * tempHeight));
                BMI = tempWeight / (tempHeight * tempHeight);
                stringBMI = Double.toString(BMI);

                //set the second activity
                Intent intent = new Intent(firstScreen.this, secondScreen.class);
                intent.putExtra("bmi", stringBMI);
                startActivity(intent);

            }
        });
    }
}
