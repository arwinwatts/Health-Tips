package com.example.healthcare_app;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataClass> dataList;
    MyAdapter adapter;
    DataClass androidData;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.search);

        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new DataClass("Diabetes (Diabetes mellitus)","TIPS TO AVOID DIABETES:", "diabetes mellitus", R.string.diabetes, R.string.link2, R.string.tip1, R.string.tip2, R.string.tip3, R.string.tip4, R.string.tip5, R.string.link, R.drawable.diabetes, R.drawable.losingweight, R.drawable.active, R.drawable.healthyplantfood, R.drawable.healthyfats, R.drawable.faddiet);
        dataList.add(androidData);

        androidData = new DataClass("Heart Attack (Myocardial infarction)","TIPS TO AVOID HEARTH ATTACK:", "myocardial infarction", R.string.heart_attack,  R.string.link3, R.string.tip6, R.string.tip7, R.string.tip8, R.string.tip9, R.string.tip10, R.string.link4,R.drawable.hearthattack, R.drawable.dontsmoke, R.drawable.active, R.drawable.hearthealthyfood, R.drawable.healthyweight, R.drawable.healthysleep);
        dataList.add(androidData);

        androidData = new DataClass("Stroke (Apoplexy)","TIPS TO AVOID STROKE:", "apoplexy", R.string.stroke,  R.string.link5, R.string.tip11, R.string.tip12, R.string.tip13, R.string.tip14, R.string.tip15, R.string.link6, R.drawable.stroke, R.drawable.controllinghighbloodpressure, R.drawable.cholesterol, R.drawable.alcoholmoderation, R.drawable.avoidingillegaldrugs, R.drawable.managingdiabetes);
        dataList.add(androidData);

        androidData = new DataClass("Lung Cancer","TIPS TO AVOID LUNG CANCER :", "lung cancer", R.string.lung_cancer,  R.string.link7, R.string.tip16, R.string.tip17, R.string.tip18, R.string.tip19, R.string.tip20, R.string.link8, R.drawable.lungcanser, R.drawable.dontsmoke, R.drawable.stopsmoking , R.drawable.secondhandsmoke, R.drawable.carcinogen, R.drawable.exercise);
        dataList.add(androidData);



        adapter = new MyAdapter(MainActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }

    private void searchList(String text){
        List<DataClass> dataSearchList = new ArrayList<>();
        for (DataClass data : dataList){
            if (data.getDataSort().toLowerCase().contains(text.toLowerCase())||data.getDataTitle().toLowerCase().contains(text.toLowerCase()))
            {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}