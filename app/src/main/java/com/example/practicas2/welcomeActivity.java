package com.example.practicas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class welcomeActivity extends AppCompatActivity {
    private View darlike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toast.makeText(welcomeActivity.this,"click supern",Toast.LENGTH_LONG).show();

        //String[] posters = {"Juan Pérez","María Díaz","Pablo Marmol"}; //transformar a array
        final List<String> posters = new ArrayList<String>();
        posters.add("Juan Pérez");
        posters.add("María Días");
        posters.add("Pablo Mármol");

        String[] hobbies = {"Juan mostrando una de sus facetas, tocar la guitarra","María adora cantar en público, por eso le gustan mucho los karaokes"};
        // ListAdapter postersAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,posters);
        ListView postersListView = (ListView) findViewById(R.id.lvPhotos);

        ListAdapter postersAdapter = new customAdapter(this,posters);
        //ListAdapter postersAdapter = new MyAdapter(this,R.layout.custom_grid_photos_layout,posters);
        postersListView.setAdapter(postersAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_8_ball_pool);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
