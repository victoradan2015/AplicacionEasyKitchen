package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }



    public void Registrarse(View view) {
        Intent clickear = new Intent(this, Registro.class);
        startActivity(clickear);
    }

    public void IniciarSesion(View view){
        Intent mexicana = new Intent(this, RepertorioPaises.class);
        startActivity(mexicana);
    }

}