package com.myappclub6to7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvEmail = findViewById(R.id.tv_email);

        Intent i = getIntent();
        String strEmail = i.getStringExtra("KEY_EMAIL");
        String radioName = i.getStringExtra("KEY_RADIO");
        tvEmail.setText("Email id is: "+strEmail+"  RadioName "+radioName);

    }
}