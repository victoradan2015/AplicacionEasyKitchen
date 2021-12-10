package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void Login(View view) {
        Intent clickear = new Intent(this, Login.class);
        startActivity(clickear);
    }

    public void Resgistrarme(View view) {
        Intent clickear = new Intent(this, RepertorioPaises.class);
        startActivity(clickear);
    }

}