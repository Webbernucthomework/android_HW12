package com.example.hw12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView3);
        image.setOnClickListener(new View.OnClickListener() {

            private boolean aaa = false;

            @Override
            public void onClick(View v) {

                if (!aaa){
                    image.setImageResource(R.drawable.flower);
                    aaa = true;
                }else if (aaa){
                    image.setImageResource(R.drawable.tommorflower);
                    aaa = false;
                }

            }
        });


    }
}
