package com.santiago.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment01 extends Fragment {

    private static final String TAG = Fragment01.class.getSimpleName();
    private RecyclerView recyclerView;
    public Fragment01() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_fragment01, container, false);
        //llamar al recycler view
        recyclerView = (RecyclerView)view.findViewById(R.id.contactlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onCreateView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onCreateView");
    }



}
