package com.example.johncarter.ahhkaya.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.johncarter.ahhkaya.R;
import com.example.johncarter.ahhkaya.recyclerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView = (RecyclerView) rootview.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(rootview.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new recyclerAdapter();
        recyclerView.setAdapter(adapter);
        return rootview;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);
    }

}
