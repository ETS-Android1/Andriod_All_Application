package com.example.onlineclothsstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements ClothFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar=findViewById(R.id.toolbar);
//       setActionBar(toolbar);

    }

    @Override
    public void ItemClickListener(long id) {
        Intent  intent= new Intent(getApplicationContext(), ActivityTwo.class);
        intent.putExtra("position",(int)id);
        startActivity(intent);

    }
}
