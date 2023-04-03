package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner ospin;
    Spinner ispin;
    Button conb;
    TextView otext;
    EditText itext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ospin = findViewById(R.id.ospin);
        ispin = findViewById(R.id.ispin);
        conb = findViewById(R.id.cbut);
        otext = findViewById(R.id.outputtext);
        itext = findViewById(R.id.inputtext);

        String[] from = {"Pound","Ounce","Ton","Inch","Foot","Yard","Mile","Celsius","Fahrenheit","Kelvin"};
        ArrayAdapter arinput = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        ispin.setAdapter(arinput);

        String[] to = {"Grams","Kilogram","Centimetres","Kilometres","Celsius","Fahrenheit","Kelvin"};
        ArrayAdapter aroutput = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        ospin.setAdapter(aroutput);


    }
    public  void onClick(View view){
        Double result;
        Double value = Double.parseDouble(itext.getText().toString());

        if (ispin.getSelectedItem().toString()== "Pound"&& ospin.getSelectedItem().toString()=="Grams"){
            result = value *453.6;
            otext.setText(Double.toString(result));
        } else if (ispin.getSelectedItem().toString()== "Ounce"&& ospin.getSelectedItem().toString()=="Grams") {
            result = value *28.35;
            otext.setText(Double.toString(result));
        } else if (ispin.getSelectedItem().toString()== "Ton"&& ospin.getSelectedItem().toString()=="Grams") {
            result = value *1e+6;
            otext.setText(Double.toString(result));
        } if (ispin.getSelectedItem().toString()== "Pound"&& ospin.getSelectedItem().toString()=="Kilogram"){
            result = value /2.205;
            otext.setText(Double.toString(result));
        } else if (ispin.getSelectedItem().toString()== "Ounce"&& ospin.getSelectedItem().toString()=="Kilogram") {
            result = value /35.274;
            otext.setText(Double.toString(result));
        } else if (ispin.getSelectedItem().toString()== "Ton"&& ospin.getSelectedItem().toString()=="Kilogram") {
            result = value *1000;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Inch"&& ospin.getSelectedItem().toString()=="Centimetres") {
            result = value *2.54;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Foot"&& ospin.getSelectedItem().toString()=="Centimetres") {
            result = value *30.48;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Yard"&& ospin.getSelectedItem().toString()=="Kilometres") {
            result = value *1.609;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Celsius"&& ospin.getSelectedItem().toString()=="Fahrenheit") {
            result = (value*1.8)+32;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Fahrenheit"&& ospin.getSelectedItem().toString()=="Celsius") {
            result = (value-32)/1.8;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Celsius"&& ospin.getSelectedItem().toString()=="Kelvin") {
            result = value+273.15;
            otext.setText(Double.toString(result));
        }
        else if (ispin.getSelectedItem().toString()== "Kelvin"&& ospin.getSelectedItem().toString()=="Celsius") {
            result = value - 273.15;
            otext.setText(Double.toString(result));
        }


    }}