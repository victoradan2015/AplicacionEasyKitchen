package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RepertorioRecetasColombia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_colombia);
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