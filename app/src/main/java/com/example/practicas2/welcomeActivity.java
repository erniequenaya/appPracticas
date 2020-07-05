package com.example.practicas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String[] posters = {"Juan Pérez","Juan mostrando una de sus facetas, tocar la guitarra","María Díaz","María adora cantar en público, por eso le gustan mucho los karaokes"};
        ListAdapter postersAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,posters);
        ListView postersListView = (ListView) findViewById(R.id.lvPhotos);
        postersListView.setAdapter(postersAdapter);

        postersListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String poster = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(welcomeActivity.this,poster,Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}
