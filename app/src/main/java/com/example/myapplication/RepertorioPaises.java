package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioPaises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_paises);
    }

    public void Mexicana(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasMexico.class);
        startActivity(clickear);
    }

    public void Japonesa(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasJapon.class);
        startActivity(clickear);
    }


}