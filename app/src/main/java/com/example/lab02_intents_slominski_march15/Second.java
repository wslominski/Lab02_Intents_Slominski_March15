package com.example.lab02_intents_slominski_march15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Second extends AppCompatActivity {

    private ImageView supermoonImg;
    private ImageView waterfallImg;
    private int imageID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("Second Activity");

        supermoonImg = findViewById(R.id.supermoon);
        waterfallImg = findViewById(R.id.waterfall);



        supermoonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageID = R.drawable.supermoon;
                finish();
            }
        });

        waterfallImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageID = R.drawable.waterfall;
                finish();

            }
        });

        }

        @Override
        public void finish() {
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
