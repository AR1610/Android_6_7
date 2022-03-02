package com.myappclub6to7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class SimpleGridViewActivity extends AppCompatActivity {
GridView gridView;
    String strData[] = {"Android","Java",".net","PHP","C","C++"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_grid_view);
        gridView = findViewById(R.id.grid_view);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, R.layout.raw_list,R.id.tv_data,strData);

    gridView.setAdapter(arrayAdapter);

    }
}