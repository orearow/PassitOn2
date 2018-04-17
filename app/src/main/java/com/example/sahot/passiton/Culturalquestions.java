package com.example.sahot.passiton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Culturalquestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culturalquestions);

        getSupportActionBar().setTitle("Pass It On");

        Button newButton = (Button) findViewById(R.id.button10);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Culturalquestions.this, pictures_cultural.class));
                //startActivity(new Intent(Mainpitchdescription.this, Contactowner.class));


            }
        });
}
}