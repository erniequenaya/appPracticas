package com.example.practicas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class addActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_moe_round);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWelcome = new Intent(addActivity.this,welcomeActivity.class);
                startActivity(intentWelcome);
            }
        });

        ImageButton btnAddProfPic = (ImageButton) findViewById(R.id.ibAddProfile);
        btnAddProfPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openGallery = new Intent();
                openGallery.setType("image/*");
                openGallery.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(openGallery, "Select profile picture"), 1);
            }
        });

        ImageButton btnAddHobby = (ImageButton) findViewById(R.id.ibAddHobby);
        btnAddHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openGallery = new Intent();
                openGallery.setType("image/*");
                openGallery.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(openGallery, "Select hobby picture"), 1);
            }
        });
    }
}
