package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RepertorioRecetasChina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_china);
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


    public void AbalonEnLecho(View view) {
        Intent clickear = new Intent(this, AbalonEnLeche.class);
        startActivity(clickear);
    }

    public void ArrozCongee(View view) {
        Intent clickear = new Intent(this, ArrozCongee.class);
        startActivity(clickear);
    }

    public void ChopSuey(View view) {
        Intent clickear = new Intent(this, Chopsuey.class);
        startActivity(clickear);
    }

    public void ChowMein(View view) {
        Intent clickear = new Intent(this, ChowMein.class);
        startActivity(clickear);
    }

    public void DimSun(View view) {
        Intent clickear = new Intent(this, DimSun.class);
        startActivity(clickear);
    }

    public void Mapotofu(View view) {
        Intent clickear = new Intent(this, Mapotofu.class);
        startActivity(clickear);
    }

    public void PatoLaqueadoAlaPekinesa(View view) {
        Intent clickear = new Intent(this, PatoLaqueadoAlaPekinesa.class);
        startActivity(clickear);
    }

}