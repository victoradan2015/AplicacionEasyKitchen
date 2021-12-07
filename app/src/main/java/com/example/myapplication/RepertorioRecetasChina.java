package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepertorioRecetasChina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertorio_recetas_china);
    }

    public void AbalonEnLecho(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

    public void ArrozCongee(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

    public void ChopSuey(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

    public void ChowMein(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

    public void DimSun(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

    public void Mapotofu(View view) {
        Intent clickear = new Intent(this, Pizza.class);
        startActivity(clickear);
    }

}