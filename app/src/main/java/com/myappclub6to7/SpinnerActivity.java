package com.myappclub6to7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    TextView tvSpinner;
    // data
    String strLang[] = {"Android","Java",".net","PHP","C","C++","IOS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);
        tvSpinner = findViewById(R.id.tv_spinner);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String strItem = parent.getItemAtPosition(position).toString();
                tvSpinner.setText("Selected Language is "+strItem);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}