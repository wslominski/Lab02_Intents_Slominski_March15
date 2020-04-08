package com.example.lab02_intents_slominski_march15;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    private Button setBackground;
    public static final int BACKGROUND_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("First Activity");

        setBackground = findViewById(R.id.set_background);

        setBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Second.class);

                startActivityForResult(intent, BACKGROUND_CODE);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == BACKGROUND_CODE && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();
            if (extras != null) {
                int imageID = extras.getInt("imageID");
                RelativeLayout currentLayout = findViewById(R.id.mainLayout);
                currentLayout.setBackground(getDrawable(imageID));
            }
        }


    }
}
