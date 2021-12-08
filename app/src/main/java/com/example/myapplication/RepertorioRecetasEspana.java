package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioRecetasEspana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_espana);
    }

    public void BacalaoALaVizcaina(View view) {
        Intent clickear = new Intent(this, BacalaoALaVizcaina.class);
        startActivity(clickear);
    }

    public void BoqueronesFritos(View view) {
        Intent clickear = new Intent(this, BoqueronesFritos.class);
        startActivity(clickear);
    }

    public void Chipirones(View view) {
        Intent clickear = new Intent(this, Chipirones.class);
        startActivity(clickear);
    }

    public void ChorizoALaSidra(View view) {
        Intent clickear = new Intent(this, ChorizoALaSidra.class);
        startActivity(clickear);
    }

    public void CocidoMadrileno(View view) {
        Intent clickear = new Intent(this, ChorizoALaSidra.class);
        startActivity(clickear);
    }

    public void Croquetas(View view) {
        Intent clickear = new Intent(this, ChorizoALaSidra.class);
        startActivity(clickear);
    }

    public void Escalivada(View view) {
        Intent clickear = new Intent(this, ChorizoALaSidra.class);
        startActivity(clickear);
    }

}