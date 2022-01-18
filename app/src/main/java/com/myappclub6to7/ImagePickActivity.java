package com.myappclub6to7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.net.URI;

public class ImagePickActivity extends AppCompatActivity {

    ImageView imgDP;
    Button btnGallery,btnCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pick);
        btnGallery = findViewById(R.id.btn_gallery);
        imgDP = findViewById(R.id.img_dp);
        btnCamera = findViewById(R.id.btn_camera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,12);

            }
        });

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setAction(Intent.ACTION_PICK);
                i.setType("image/*");
                startActivityForResult(i,11);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 11){
            Uri uri =  data.getData();
            imgDP.setImageURI(uri);
        }
        if (requestCode == 12){

            Log.e("TAG", "onActivityResult: "+ data.getExtras().get("data"));
       Bitmap bitmap = (Bitmap)data.getExtras().get("data");
       imgDP.setImageBitmap(bitmap);
        }


    }
}