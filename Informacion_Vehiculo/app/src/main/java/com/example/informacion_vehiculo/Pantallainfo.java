package com.example.informacion_vehiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pantallainfo extends AppCompatActivity {

    public TextView textopantalla1;
    public TextView textopantalla2;
    public TextView textopantalla3;
    public TextView textopantalla5;
    public TextView textopantalla7;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallainfo);
        textopantalla1 = findViewById(R.id.TextoPantalla1);
        textopantalla2 = findViewById(R.id.TextoPantalla2);
        textopantalla3 = findViewById(R.id.TextoPantalla3);
        textopantalla5 = findViewById(R.id.TextoPantalla5);
        textopantalla7 = findViewById(R.id.TextoPantalla7);

        TomarDatos();
    }
    public void TomarDatos (){

        Bundle Informacion = getIntent().getExtras();
        String color = Informacion.getString("Color");
        String placa = Informacion.getString("Placa");
        int ano = Informacion.getInt("Ano");
        int kilometraje = Informacion.getInt("Kilometraje");
        int peso = Informacion.getInt("Peso");

        textopantalla1.setText(color);
        textopantalla2.setText(placa);
        textopantalla3.setText(ano+"");
        textopantalla5.setText(kilometraje+"");
        textopantalla7.setText(peso+"");



    }

}
