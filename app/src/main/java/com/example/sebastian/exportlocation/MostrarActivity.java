package com.example.sebastian.exportlocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        Intent intent = getIntent();
        String estacion = intent.getStringExtra("Estacion");
        String ticket = intent.getStringExtra("Ticket");
        final TextView message = (TextView) findViewById(R.id.message);
        message.setText("Gracias por tu colaboración. Tu actividad en la estación "+estacion+
                " con el tiquete "+ticket+" fue almacenada con éxito");

    }
}
