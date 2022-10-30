package com.example.sin_fut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etnum1; // estamos creando los objetos que iran relacionados con los componentes(views) de la parte grafica
    private EditText etnum2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    etnum1 = (EditText) findViewById(R.id.txt_numero1); // estamos relacionando los componentes graficos con los objetos meidnate id de los componentes (se castea a edittext)
    etnum2 = (EditText) findViewById(R.id.txt_numero2);
    tv1 = (TextView) findViewById(R.id.txt_resultado);
    }

    public void suma (View view){
        String num1 = etnum1.getText().toString();
        String num2 = etnum2.getText().toString();
        int valor1 = Integer.parseInt(num1);
        int valor2 = Integer.parseInt(num2);

        int suma = valor1+valor2;

        String enviarValor = String.valueOf(suma);

        tv1.setText(enviarValor);
    }
}