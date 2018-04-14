package com.example.sahot.passiton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mainpitchdescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpitchdescription);

        Button newButton = (Button) findViewById(R.id.button9);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mainpitchdescription.this, Contactowner.class));
                //startActivity(new Intent(Mainpitchdescription.this, Contactowner.class));
            }
        });

        startActivity(new Intent(PassItOn.this,MainActivity.class));


    }
}