package com.example.sahot.passiton;

import android.content.Intent;
<<<<<<< HEAD
=======
import android.graphics.Bitmap;
import android.provider.MediaStore;
>>>>>>> 13f970599045479732c8c19d3a074bae8c321fd3
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
<<<<<<< HEAD
=======
import android.widget.ImageView;
>>>>>>> 13f970599045479732c8c19d3a074bae8c321fd3

public class share extends AppCompatActivity {
    ImageView camera_image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);


<<<<<<< HEAD

        ImageButton recent_upload = (ImageButton) findViewById(R.id.imageButton12);

        recent_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(share.this, camera.class));
                //startActivity(new Intent(share.this, camera.class));
=======
        ImageButton camera_icon = (ImageButton) findViewById(R.id.imageButton2);
        camera_image_view = (ImageView) findViewById(R.id.camera_image_view);
        camera_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
                //startActivity(new Intent(MainActivity.this, RecentUploads.class));
>>>>>>> 13f970599045479732c8c19d3a074bae8c321fd3
            }
        });


    }


    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        camera_image_view.setImageBitmap(bitmap);


        getSupportActionBar().setTitle("Pass It On");
    }



}
