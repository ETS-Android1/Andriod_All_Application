package com.example.choseyourtea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void onSwitchClicked(View v){
    boolean on =((ToggleButton) v).isChecked();
       ToggleButton toggleButton=findViewById(R.id.togbtn);

    if(on){
        //toggleButton.setText("Hot");
    }else {
        //toggleButton.setText("Cold");
    }
   }
      public void onCheckBoxClicked(View v){
     boolean checked= ((CheckBox)v).isChecked();
     switch (v.getId()){
         case (R.id.checkbox_milk):
             if (checked){
                 Toast.makeText(this,"Milk coffee",Toast.LENGTH_LONG).show();
             }else {
                 Toast.makeText(this,"Black coffee",Toast.LENGTH_LONG).show();
             }break;


         case (R.id.checkbox_sugar):
             if (checked){
                 Toast.makeText(this,"Sweet coffee",Toast.LENGTH_LONG).show();
             }else {
                 Toast.makeText(this,"Better coffee",Toast.LENGTH_LONG).show();
             }break;

         case (R.id.checkbox_lemon):
             if (checked){
                 Toast.makeText(this,"Lemon coffee",Toast.LENGTH_LONG).show();
             }else {
                 Toast.makeText(this,"Without lemon  coffee",Toast.LENGTH_LONG).show();
             }break;

     }
      }
 }


