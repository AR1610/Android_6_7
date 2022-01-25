package com.myappclub6to7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekbarRatingbarActivity2 extends AppCompatActivity {
    SeekBar seekBar;
    TextView tvSeekbar,tvRatingbar;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_ratingbar2);
        seekBar = findViewById(R.id.seekbar);
        tvSeekbar = findViewById(R.id.tv_seekbar);
        ratingBar = findViewById(R.id.ratingbar);
        tvRatingbar = findViewById(R.id.tv_rating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                tvRatingbar.setText(String.valueOf(rating));
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekbar.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}