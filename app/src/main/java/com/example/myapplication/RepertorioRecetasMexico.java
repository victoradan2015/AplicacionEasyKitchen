package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioRecetasMexico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_mexico);
    }

    public void TacosCochinita(View view) {
        Intent clickear = new Intent(this, TacosCochinitaPibil.class);
        startActivity(clickear);
    }

    public void ArrozLeche(View view) {
        Intent clickear = new Intent(this, ArrozConLeche.class);
        startActivity(clickear);
    }

    public void AsadoVerde(View view) {
        Intent clickear = new Intent(this, AsadoVerde.class);
        startActivity(clickear);
    }

    public void Bunuelos(View view) {
        Intent clickear = new Intent(this, Bunuelos.class);
        startActivity(clickear);
    }

    public void ChilesPoblanos(View view) {
        Intent clickear = new Intent(this, ChilesPoblanos.class);
        startActivity(clickear);
    }

    public void Churros(View view) {
        Intent clickear = new Intent(this, Churros.class);
        startActivity(clickear);
    }


}