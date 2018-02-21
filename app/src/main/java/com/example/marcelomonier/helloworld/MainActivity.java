package com.example.marcelomonier.helloworld;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView alcool;
    TextView gasolina;

    EditText valorAlcool;
    EditText valorGasolina;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        alcool = (TextView) findViewById(R.id.textView);
        gasolina = (TextView) findViewById(R.id.textView2);

        valorAlcool = (EditText) findViewById(R.id.editText4);
        valorGasolina = (EditText) findViewById(R.id.editText3);


        btn = (Button) findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Recuperar os valores digitados
                String textoPrecoAlcool = valorAlcool.getText().toString();
                String textoPrecoGasolina = valorGasolina.getText().toString();

                //Converter valores para numeros
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //Alcool /Gasolina
                double resultado = valorAlcool / valorGasolina;

                if(resultado >= 0.7){
                    //Gasolina
                    //Pop-up!
                    Toast.makeText(getApplicationContext(),
                            "É melhor usar gasolina!", Toast.LENGTH_LONG).show();

                }else{
                    //Alcool
                    Toast.makeText(getApplicationContext(),
                            "É melhor usar Álcool!", Toast.LENGTH_LONG).show();
                }



            }
        });

    }
}
