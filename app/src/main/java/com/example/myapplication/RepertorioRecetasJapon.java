package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RepertorioRecetasJapon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_japon);
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