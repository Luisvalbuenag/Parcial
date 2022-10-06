package com.example.informacion_vehiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textopantalla;
    private Carro carrito;
    private EditText ValorASumar;
    private EditText editortexto1;
    private EditText editortexto2;
    private EditText editortexto3;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carrito = new Carro("Azul",23,456,4,2018,"SAZ24D",56);

        textopantalla = findViewById(R.id.Textopantalla);
        editortexto1 = findViewById(R.id.EditorTexto1);


    }

    public void Cambiarpestana(View view) {


        Intent Siguiente = new Intent(MainActivity.this,Pantallainfo.class);

        Siguiente.putExtra("Color",carrito.getColor());
        Siguiente.putExtra("Peso",carrito.getPeso());
        Siguiente.putExtra("Ano",carrito.getAno());
        Siguiente.putExtra("Placa",carrito.getPlaca());
        Siguiente.putExtra("Kilometraje",carrito.getKilometraje());
        Siguiente.putExtra("Placa",carrito.getPlaca());




        startActivity(Siguiente);



    }



}
