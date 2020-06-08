package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //we use View view for listener. there is for Onebln we use this function
    public void Onebtn(View view){
        /* While using EditText control in our android applications, we need to specify the type of data the text field can accept using the inputType attribute.
For example, if it accept plain text, then we need to specify the inputType as “text”. In case if EditText field is for password, then we need to specify the inputType as “textPassword”.
In android, EditText control is an extended version of TextView control with additional features and it is used to allow users to enter input values.*/
        EditText dollarAmount= (EditText)findViewById(R.id.dollartxt);
        String dollar;
        dollar=dollarAmount.getText().toString();
        double ddollars;
        //paraseDouble =Converting String to Double in Android
        ddollars=Double.parseDouble(dollar);
        double bdtt= 84.93* ddollars;

        //By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.
        String r= String.valueOf(bdtt);
        //A toast provides simple feedback about an operation in a small popup.
        Toast.makeText(this, r, Toast.LENGTH_SHORT).show();







    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}