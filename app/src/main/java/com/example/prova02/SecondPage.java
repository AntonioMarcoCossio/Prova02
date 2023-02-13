package com.example.prova02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Bundle datipassati = getIntent().getExtras();
        String dato1 = datipassati.getString("valore");//qui sto ricevend il dato dall'Intent


        TextView textView = (TextView) findViewById(R.id.testo2);
        textView.setText(dato1); //set text for text view


        Button pulsante= (Button) findViewById(R.id.bottone2);
        pulsante.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                Intent openMainPage = new Intent(SecondPage.this,MainActivity.class);
                EditText variabile = (EditText) findViewById(R.id.Name2);
                String strValue = variabile.getText().toString();
                openMainPage.putExtra("valore",strValue);
                startActivity(openMainPage);

            }
        });



    }
}