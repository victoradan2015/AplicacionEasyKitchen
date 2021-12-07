package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioRecetasItalia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_italia);
    }

    public void Agnolotti(View view) {
        Intent clickear = new Intent(this, Agnolotti.class);
        startActivity(clickear);
    }

    public void Caprece(View view) {
        Intent clickear = new Intent(this, Caprese.class);
        startActivity(clickear);
    }

    public void Carpaccio(View view) {
        Intent clickear = new Intent(this, Carpaccio.class);
        startActivity(clickear);
    }

    public void Gnocci(View view) {
        Intent clickear = new Intent(this, Gnocci.class);
        startActivity(clickear);
    }

    public void Lapolenta(View view) {
        Intent clickear = new Intent(this, LaPolenta.class);
        startActivity(clickear);
    }

    public void Lasana(View view) {
        Intent clickear = new Intent(this, Lasana.class);
        startActivity(clickear);
    }

    public void Minestrone(View view) {
        Intent clickear = new Intent(this, Minestrone.class);
        startActivity(clickear);
    }

    public void Ossobuco(View view) {
        Intent clickear = new Intent(this, Ossobuco.class);
        startActivity(clickear);
    }

    public void Pasta(View view) {
        Intent clickear = new Intent(this, Pasta.class);
        startActivity(clickear);
    }

    public void Pizza(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

    public void Ravioles(View view) {
        Intent clickear = new Intent(this, Ravioles.class);
        startActivity(clickear);
    }

    public void Risotto(View view) {
        Intent clickear = new Intent(this, Risotto.class);
        startActivity(clickear);
    }

    public void Spagetti(View view) {
        Intent clickear = new Intent(this, Spagetti.class);
        startActivity(clickear);
    }

}