package com.example.onlineclothsstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailFragment extends Fragment {
  int index;
    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater,container,savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        View view= getView();
        if(view!=null){
            TextView tv_name=view.findViewById(R.id.tv_name);
            TextView tv_dsc=view.findViewById(R.id.tv_dsc);
            ImageView imageView= view.findViewById(R.id.img_view);
            tv_name.setText(Cloth.cloths[index].getName());
            tv_dsc.setText(Cloth.cloths[index].getDsc());
            imageView.setImageResource(Cloth.cloths[index].getId());
        }
    }
    public void setIndex(int pos){
        this.index=pos;

    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        saveInstanceState.putInt("index",index);
    }
}
