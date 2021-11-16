package com.example.tabletworkout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListFragment extends androidx.fragment.app.ListFragment {

    static interface Listener {
        void itemClicked(long id);
    }

    ;
    private Listener listener;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter arrayAdapter = new ArrayAdapter(inflater.getContext(),
                android.R.layout.simple_list_item_1, Workout.workouts);
        setListAdapter(arrayAdapter);
      //  ListView listView = getListView();

        // Inflate the layout for this fragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }


    }
}