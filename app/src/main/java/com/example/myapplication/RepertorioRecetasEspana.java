package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RepertorioRecetasEspana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_espana);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent clickear = new Intent(this, Login.class);
            startActivity(clickear);
            return true;
        }

        return super.onOptionsItemSelected(item);
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
        Intent clickear = new Intent(this, CocidoMadrileno.class);
        startActivity(clickear);
    }

    public void Croquetas(View view) {
        Intent clickear = new Intent(this, Croquetas.class);
        startActivity(clickear);
    }

    public void Escalivada(View view) {
        Intent clickear = new Intent(this, Escalivada.class);
        startActivity(clickear);
    }

}