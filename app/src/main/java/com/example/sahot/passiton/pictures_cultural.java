package com.example.sahot.passiton;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pictures_cultural extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures_cultural);

        ImageButton btn = (ImageButton) findViewById(R.id.imageButton2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pictures_cultural.this, Mainpitchdescription.class));
                //startActivity(new Intent(MainActivity.this, RecentUploads.class));
            }
        });

        getSupportActionBar().setTitle("Pass It On");
    }
}
