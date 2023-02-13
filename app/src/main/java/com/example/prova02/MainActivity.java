package com.example.prova02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pulsante= (Button) findViewById(R.id.bottone1);
                pulsante.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick (View arg0){
                        Intent openSecondPage = new Intent(MainActivity.this, SecondPage.class);
                        EditText variabile = (EditText) findViewById(R.id.Name);
                        String strValue = variabile.getText().toString();
                        openSecondPage.putExtra("valore",strValue);
                        startActivity(openSecondPage);

                    }
                });


        }
}