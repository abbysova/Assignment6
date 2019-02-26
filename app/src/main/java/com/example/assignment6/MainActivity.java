package com.example.assignment6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
String Holly_number, Abbi_number, Korb_number;
Button Holly_button, Abbi_button, Korb_button;
Button Holly_text_button, Abbi_text_button, Korb_text_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
public void textPerson(View view){
    Intent intent = new Intent(Intent.ACTION_PROCESS_TEXT);
    String hiMessage = "Hi";

    if(Holly_text_button.isSelected()){
        intent.setData(Uri.parse(Holly_number));}
     if (Korb_text_button.isSelected()){
        intent.setData(Uri.parse(Korb_number));}
     else{
         intent.setData(Uri.parse(Abbi_number));}

    }
 public void callPerson(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);

     if(Holly_button.isSelected()){
         intent.setData(Uri.parse(Holly_number));}
     if (Korb_button.isSelected()){
         intent.setData(Uri.parse(Korb_number));}
     else{
         intent.setData(Uri.parse(Abbi_number));}

 }

 }

