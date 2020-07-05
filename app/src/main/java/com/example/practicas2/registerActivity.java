package com.example.practicas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class registerActivity extends AppCompatActivity {
    private View tv_Login;
    private View btn_Welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // intent register -> login
        tv_Login = (TextView) findViewById(R.id.tvLogin);
        tv_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTvLogin = new Intent(registerActivity.this,MainActivity.class);
                startActivity(intentTvLogin);
            }
        });


    }
}