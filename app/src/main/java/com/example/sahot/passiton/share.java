package com.example.sahot.passiton;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);



        ImageButton recent_upload = (ImageButton) findViewById(R.id.imageButton12);

        recent_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(share.this, camera.class));
                //startActivity(new Intent(share.this, camera.class));
            }
        });


    }
}
