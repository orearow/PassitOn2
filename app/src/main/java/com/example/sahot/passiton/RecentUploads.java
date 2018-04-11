package com.example.sahot.passiton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecentUploads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_uploads);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.technovationlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

    }
}
