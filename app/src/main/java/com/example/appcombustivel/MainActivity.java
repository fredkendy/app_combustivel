package com.example.appcombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Declarando variáveis em escopo global
    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperando valores digitados pelo usuário, mas em formato String
        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);

    }

    //Precisa importar o View
    public void calcularPreco(View view) {

        //Convertendo valores captados em número
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        /*Faz cálculo precoAlcool / precoGasolina
        Se resultado >= 0.7, melhor utilizar gasolina, senão, álcool */

        Double resultado = precoAlcool/precoGasolina;

        if (resultado >= 0.7) {
            textResultado.setText("Melhor abastecer gasolina");
        } else {
            textResultado.setText("Melhor abastecer álcool");
        }

    }

}