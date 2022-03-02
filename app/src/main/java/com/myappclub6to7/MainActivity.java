package com.myappclub6to7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail;
    Button btnLogin,btnSend;
    ImageView imgDP;
    RadioGroup radioGroup;
    CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edt_Email);
        btnLogin = findViewById(R.id.btn_login);
        imgDP = findViewById(R.id.img_dp);
        chb = findViewById(R.id.chb);
        btnSend = findViewById(R.id.btn_send);
        radioGroup = findViewById(R.id.radio_grp);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implicit Intent
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/"));
                startActivity(i);

            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strEmail = edtEmail.getText().toString();
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);
                String radioName = radioButton.getText().toString();

                if (strEmail.equals("")){
                  //  Toast.makeText(MainActivity.this, "Enter Email ID" + strEmail, Toast.LENGTH_LONG).show();
                    edtEmail.setError("Enter Email ID");
                }else {


                    if (chb.isChecked()){

                        imgDP.setImageResource(R.drawable.customer);
                        Toast.makeText(MainActivity.this, "Email id is " + strEmail, Toast.LENGTH_LONG).show();

                        // Explicit Intent
                        Intent i = new Intent(MainActivity.this,HomeActivity.class);
                        i.putExtra("KEY_EMAIL",strEmail);
                        i.putExtra("KEY_RADIO",radioName);
                        startActivity(i);

                    }else {
                        Toast.makeText(MainActivity.this, "Please Select Remember Me", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}