package com.example.sahot.passiton;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        FloatingActionButton btn = (FloatingActionButton) findViewById(R.id.share_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, share.class));
                //startActivity(new Intent(MainActivity.this, RecentUploads.class));
            }
        });

        FloatingActionButton recent_upload = (FloatingActionButton) findViewById(R.id.recent_upload_button);

        recent_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecentUploads.class));
                //startActivity(new Intent(MainActivity.this, RecentUploads.class));
            }
        });


        FloatingActionButton findNewButton = (FloatingActionButton) findViewById(R.id.find_new_button);

        findNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FindNew.class));
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.technovationlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        getSupportActionBar().setTitle("Pass It On");




    }



    }
