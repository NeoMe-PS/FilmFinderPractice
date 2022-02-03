package com.ps_bn.filmfinderpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    RvAdapter adapter;
    RecyclerView recyclerView;
    final static String KEY="title_key";
    final static String TAG=MainActivity.class.getSimpleName();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        adapter=new RvAdapter(fillList(),this);

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

    }

   /* @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (textView!=null) {
            int color = textView.getCurrentTextColor();
            outState.putInt(KEY, color);
            Log.d(TAG, "onSaveInstanceState:[" + outState.get(KEY) + "]");
            Log.d(TAG, "GetColorIs:[" + textView.getCurrentTextColor() + "]");
        }
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState!=null) {
            int k=savedInstanceState.getInt(KEY);
                textView.setTextColor(k);
        }
    }*/

    private ArrayList<RecyclerViewItem> fillList(){
        ArrayList<RecyclerViewItem>arrayList = new ArrayList<>();
        arrayList.add(new RecyclerViewItem(R.drawable.bladerunner,getResources().getString(R.string.bladeRunner),getResources().getString(R.string.bladeRunnerDesc)));
        arrayList.add(new RecyclerViewItem(R.drawable.birdman,getResources().getString(R.string.birdMan),getResources().getString(R.string.birdMan_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.dallas_buyers,getResources().getString(R.string.dallasBuyers),getResources().getString(R.string.dallasBuyers_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.interstellar,getResources().getString(R.string.interstellar),getResources().getString(R.string.interstellar_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.lalaland,getResources().getString(R.string.lalaLand),getResources().getString(R.string.lalaLand_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.mad_max,getResources().getString(R.string.madMax),getResources().getString(R.string.madMax_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.three_boards,getResources().getString(R.string.threeBoards),getResources().getString(R.string.threeBoards_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.zootopia,getResources().getString(R.string.zootopia),getResources().getString(R.string.zootopia_desc)));
        arrayList.add(new RecyclerViewItem(R.drawable.parasite,getResources().getString(R.string.parasite),getResources().getString(R.string.parasite_desc)));

        return arrayList;
    }

}