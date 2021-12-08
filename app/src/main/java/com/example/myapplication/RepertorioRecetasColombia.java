package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioRecetasColombia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_colombia);
    }

    public void Ajico(View view) {
        Intent clickear = new Intent(this, Ajiaco.class);
        startActivity(clickear);
    }

    public void Arepas(View view) {
        Intent clickear = new Intent(this, Arepas.class);
        startActivity(clickear);
    }

    public void ArrozConCoco(View view) {
        Intent clickear = new Intent(this, ArrozConCoco.class);
        startActivity(clickear);
    }

    public void BolloLimpio(View view) {
        Intent clickear = new Intent(this, BolloLimpio.class);
        startActivity(clickear);
    }

    public void Carimanola(View view) {
        Intent clickear = new Intent(this, Carimanola.class);
        startActivity(clickear);
    }

    public void Changua(View view) {
        Intent clickear = new Intent(this, Changua.class);
        startActivity(clickear);
    }

    public void Cuchuco(View view) {
        Intent clickear = new Intent(this, Cuchuco.class);
        startActivity(clickear);
    }



}