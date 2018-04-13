package com.example.sahot.passiton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RecentUploads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_uploads);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.technovationlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);




        ImageButton newButton = (ImageButton) findViewById(R.id.imageButton5);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentUploads.this, RecentUploadsDescriptionOpen.class));
                //startActivity(new Intent(MainActivity.this, RecentUploads.class));
            }
        });







    }
}