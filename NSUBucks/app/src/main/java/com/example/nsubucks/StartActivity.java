package com.example.nsubucks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import dbutils.DrinkDao;

public class StartActivity extends AppCompatActivity implements View.OnClickListener{
Button btn_new;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
      init();
      DrinkDao drinkDao= new DrinkDao(this);
        List<Drink>drinkList= drinkDao.getAllDrinks();

        ArrayAdapter drinkAdapter= new ArrayAdapter<Drink>(this,android.R.layout.simple_list_item_1,drinkList);
        ListView listView= findViewById(R.id.list_item);
        listView.setAdapter(drinkAdapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position) {
                   case 0:
                       Toast.makeText(getApplicationContext(), "You clicked first list", Toast.LENGTH_SHORT).show();
                       //Toast toast=Toast. makeText(getApplicationContext(),"Hello Javatpoint",Toast. LENGTH_SHORT);
                       break;
                   case 1:
                       Toast.makeText(getApplicationContext(), "You clicked 2nd list", Toast.LENGTH_SHORT).show();
                       break;
                   case 2:
                       Toast.makeText(getApplicationContext(), "You clicked 3rd list", Toast.LENGTH_SHORT).show();
                       break;
                   case 3:
                       Toast.makeText(getApplicationContext(), "You clicked 4th list", Toast.LENGTH_SHORT).show();
                       break;
                   case 4:
                       Toast.makeText(getApplicationContext(), "You clicked 5th list", Toast.LENGTH_SHORT).show();
                       break;
               }
           }
       });


//      for (Drink drink:drinkList){
//          Log.i("Drink",drink.toString());

      }
      
    private void init(){
        btn_new=findViewById(R.id.menu_btn);
        btn_new.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Drink drink;
        DrinkDao dd= new DrinkDao(this);
        drink = new Drink(1,"Latte", "A couple of espresso shots with steamed milk",10,1);
                dd.saveDrink(drink);
                drink= new Drink(2,"Cappuccino", "Espresso, hot milk, and a steamed milk foam",12,2);
                dd.saveDrink(drink);
                drink= new Drink(3,"Filter", "Highest quality beans roasted and brewed fresh",15,3);
                dd.saveDrink(drink);
                drink= new Drink(4,"Mango jose","In blender, add ice, Jose Cuervo Especial® Silver",20,4);
                dd.saveDrink(drink);
                drink= new Drink(5,"APPLE PIE","An apple pie is a pie in which the principal filling ingredient is apple.",25,5);
                dd.saveDrink(drink);
    }
}
