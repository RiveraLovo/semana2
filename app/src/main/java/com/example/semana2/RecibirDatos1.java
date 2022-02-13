package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RecibirDatos1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos1);

        EditText tMostrar = (EditText)findViewById(R.id.etRecibirDato);
        Button bVolver = (Button)findViewById(R.id.btVolver);

        Bundle recibido = this.getIntent().getExtras();
        String datoRecibido = recibido.getString("dNombre");
        tMostrar.setText(datoRecibido);

        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            Intent volver = new Intent(RecibirDatos1.this,MainActivity.class);
            startActivity(volver);
               }
            });


        }
}