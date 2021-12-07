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

    public void Onigiri(View view) {
        Intent clickear = new Intent(this, Onigiri.class);
        startActivity(clickear);
    }

    public void PolloTeriyaki(View view) {
        Intent clickear = new Intent(this, PolloTeriyaki.class);
        startActivity(clickear);
    }

    public void Ramen(View view) {
        Intent clickear = new Intent(this, Ramen.class);
        startActivity(clickear);
    }

    public void Sashimi(View view) {
        Intent clickear = new Intent(this, Sashimi.class);
        startActivity(clickear);
    }

    public void Soba(View view) {
        Intent clickear = new Intent(this, Soba.class);
        startActivity(clickear);
    }

    public void SopaDeMisu(View view) {
        Intent clickear = new Intent(this, SopaDeMisu.class);
        startActivity(clickear);
    }

    public void RolloSushiEmpanizado(View view) {
        Intent clickear = new Intent(this, RollosSushiEmpanizado.class);
        startActivity(clickear);
    }

}