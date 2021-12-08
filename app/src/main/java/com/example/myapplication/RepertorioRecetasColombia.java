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
        Intent clickear = new Intent(this, AbalonEnLeche.class);
        startActivity(clickear);
    }

    public void Arepas(View view) {
        Intent clickear = new Intent(this, AbalonEnLeche.class);
        startActivity(clickear);
    }

    public void ArrozConCoco(View view) {
        Intent clickear = new Intent(this, AbalonEnLeche.class);
        startActivity(clickear);
    }

    public void BolloLimpio(View view) {
        Intent clickear = new Intent(this, AbalonEnLeche.class);
        startActivity(clickear);
    }

}