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

}