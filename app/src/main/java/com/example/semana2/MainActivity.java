package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText rNombre = (EditText)findViewById(R.id.etRecibirDato);
        Button bEnviar = (Button)findViewById(R.id.btEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String dNombre = rNombre.getText().toString();

                Bundle parametro = new Bundle();
                parametro.putString("dNombre",dNombre);

                Intent Paso = new Intent(MainActivity.this,RecibirDatos1.class);

                 Paso.putExtras(parametro);
                startActivity(Paso);

            }
        });

    }
}