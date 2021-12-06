package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioRecetasJapon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_japon);
    }

    public void Dorayaki(View view) {
        Intent clickear = new Intent(this, Dorayaky.class);
        startActivity(clickear);
    }

    public void Gyosa(View view) {
        Intent clickear = new Intent(this, Gyosa.class);
        startActivity(clickear);
    }

    public void Omuraisu(View view) {
        Intent clickear = new Intent(this, Omuraisu.class);
        startActivity(clickear);
    }

}