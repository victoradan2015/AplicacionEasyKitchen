package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RepertorioPaises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_paises);
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



    public void Mexicana(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasMexico.class);
        startActivity(clickear);
    }

    public void Japonesa(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasJapon.class);
        startActivity(clickear);
    }

    public void Italiana(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasItalia.class);
        startActivity(clickear);
    }

    public void China(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasChina.class);
        startActivity(clickear);
    }

    public void Colombia(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasColombia.class);
        startActivity(clickear);
    }

    public void España(View view) {
        Intent clickear = new Intent(this, RepertorioRecetasEspana.class);
        startActivity(clickear);
    }

}