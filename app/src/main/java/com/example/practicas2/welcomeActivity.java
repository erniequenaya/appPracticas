package com.example.practicas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {
    private View darlike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //String[] posters = {"Juan Pérez",","María Díaz",""};
        String[] posters = {"Juan Pérez","María Díaz","Pablo Marmol"};
        String[] hobbies = {"Juan mostrando una de sus facetas, tocar la guitarra","María adora cantar en público, por eso le gustan mucho los karaokes"};
        // ListAdapter postersAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,posters);
        ListView postersListView = (ListView) findViewById(R.id.lvPhotos);


        postersListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String poster = String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(welcomeActivity.this,"click en",Toast.LENGTH_LONG).show();
                    }
                }
        );
        ListAdapter postersAdapter = new customAdapter(this,posters);
        postersListView.setAdapter(postersAdapter);
    }
}
