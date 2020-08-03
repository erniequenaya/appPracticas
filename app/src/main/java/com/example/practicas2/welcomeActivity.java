package com.example.practicas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        final List<String> posters = new ArrayList<String>();
        posters.add("Juan Pérez");
        posters.add("María Díaz");

        //String[] hobbies = {"Juan mostrando una de sus facetas, tocar la guitarra","María adora cantar en público, por eso le gustan mucho los karaokes"};
        // ListAdapter postersAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,posters);
        ListView postersListView = (ListView) findViewById(R.id.lvPhotos);

        ListAdapter postersAdapter = new customAdapter(this,posters);
        postersListView.setAdapter(postersAdapter);

        ImageButton ibAdd = (ImageButton) findViewById(R.id.ibAdd);
        ibAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAdd = new Intent(welcomeActivity.this,addActivity.class);
                startActivity(intentAdd);
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_moe_round);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
