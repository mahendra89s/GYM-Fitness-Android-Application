package com.art.fit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class weighttrack extends AppCompatActivity {
    Button bmibtn,ffmibtn;
    TextView bmi,ffmi,res;
    EditText eweight,eheight,ebodyfat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weighttrack);
        bmi = findViewById(R.id.bmi);
        ffmi = findViewById(R.id.ffmi);
        res = findViewById(R.id.res);
        eweight = (EditText) findViewById(R.id.weight);
        eheight = (EditText)findViewById(R.id.height);
        ebodyfat = (EditText)findViewById(R.id.bodyfat);
        //age = (EditText)findViewById(R.id.age);

        bmibtn = findViewById(R.id.bmibtn);
        ffmibtn = findViewById(R.id.ffmibtn);

        bmibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                float height = Float.parseFloat(eheight.getText().toString());
                float weight = Integer.parseInt(eweight.getText().toString());
                if(TextUtils.isEmpty(eheight.getText().toString()) && TextUtils.isEmpty(eweight.getText().toString())){
                    message = "Please Valid Details";
                }
                else{
                    float bmi1 = (weight / (height * height));
                    Log.d("bmi", String.valueOf(String.format("%.1f",bmi1)));
                    bmi.setText(String.valueOf(String.format("%.1f",bmi1)));
                    // change the message according to the bmi

                    if (bmi1 < 20)
                        message = "Underweight";
                    else if (bmi1 >=20 && bmi1 < 30)
                        message = "Normal";
                    else
                        message = "Overweight";
                }

                res.setText("BMI is " + message);
                // print the bmi on a toast
                Toast.makeText(weighttrack.this, message, Toast.LENGTH_LONG).show();
            }
        });
        ffmibtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String message = "";
                float height = Float.parseFloat(eheight.getText().toString());
                float weight = Float.parseFloat(eweight.getText().toString());
                float bodyfat = Float.parseFloat(ebodyfat.getText().toString());
                if(TextUtils.isEmpty(eheight.getText().toString()) && TextUtils.isEmpty(eweight.getText().toString())){
                    message = "Please Valid Details";
                }
                else{
                    float ffmi1 = (weight *(1-(bodyfat/100)) / (height * height));

                    ffmi.setText(String.valueOf(String.format("%.1f",ffmi1)));
                    // change the message according to the bmi

                    if (ffmi1 < 18)
                        message = "Underweight";
                    else if (ffmi1 >=18 && ffmi1 < 20)
                        message = "Normal";
                    else
                        message = "Overweight";
                }

                res.setText("FFMI is " + message);
                // print the bmi on a toast
                Toast.makeText(weighttrack.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }


}