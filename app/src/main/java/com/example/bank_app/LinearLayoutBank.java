package com.example.bank_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
    }

    public void NextActivityOnClick(android.view.View view)
    {
        Intent intent = new Intent(this, ConstraintLayoutBank.class);
        startActivity(intent);
    }
}