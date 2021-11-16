package com.example.onlineclothsstore;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ClothFragment extends ListFragment {
    Listener listener;
    static interface Listener{
    void ItemClickListener(long id);
    };

    public ClothFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter clothAdapter= new ArrayAdapter(inflater.getContext(),
                android.R.layout.simple_list_item_1,Cloth.cloths);
         setListAdapter(clothAdapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener=(Listener)context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
       if(listener!=null){
           listener.ItemClickListener(position);
       }
    }
}
