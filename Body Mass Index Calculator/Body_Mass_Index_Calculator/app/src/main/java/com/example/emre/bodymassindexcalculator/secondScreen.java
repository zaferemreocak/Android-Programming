package com.example.emre.bodymassindexcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.DecimalFormat;

public class secondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        final TextView resultBMI = (TextView) findViewById(R.id.resultBMI);
        Bundle bundle = getIntent().getExtras();
        String sResult = bundle.getString("bmi");
        double bmx; String decimalFormat;



        if(bundle == null){
            sResult = "";
        }
        else{
            //Show valid result
            bmx = Double.parseDouble(sResult);
            sResult = new DecimalFormat("#.#").format(bmx);
            resultBMI.setText(">>>" + sResult + "<<<" );

        }

        //DecimalFormat bmi_last = new DecimalFormat("#.##").format(getBMI);

        //DecimalFormat df = new DecimalFormat("#.#");
        //df.setRoundingMode(RoundingMode.CEILING);


        //String sResult= Double.toString(df.format());

    }
}
