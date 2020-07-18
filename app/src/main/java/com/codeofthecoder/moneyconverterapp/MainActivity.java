package com.codeofthecoder.moneyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.PrintWriterPrinter;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.PrintWriter;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    public void btnClick(View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        String dollars = editText.getText().toString();
        Double doubleDollars =  Double.parseDouble(dollars);
        Double doubleinr = 76.33 * doubleDollars;
        String ans = doubleDollars + "$" + "=" + doubleinr.toString() + ".RS";
       Toast.makeText(this,ans,Toast.LENGTH_LONG).show();

//        if(editText == null){
//            String Error = "Please Enter Dollar Amount For Convert";
//            Toast.makeText(this,Error,Toast.LENGTH_LONG).show();
//        }textView


    }
    public void clear(View view){
        Set editText = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
