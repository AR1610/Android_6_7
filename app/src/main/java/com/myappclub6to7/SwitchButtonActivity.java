package com.myappclub6to7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SwitchButtonActivity extends AppCompatActivity {


    Switch aSwitch;
    SwitchCompat switchCompat;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);

        aSwitch = findViewById(R.id.a_switch);
        switchCompat = findViewById(R.id.b_switch);
        toggleButton = findViewById(R.id.btn_toggle);


        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(SwitchButtonActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SwitchButtonActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });




        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(SwitchButtonActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SwitchButtonActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });



        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(SwitchButtonActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SwitchButtonActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}