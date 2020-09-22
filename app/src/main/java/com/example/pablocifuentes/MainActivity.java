package com.example.pablocifuentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ET1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = (EditText)findViewById(R.id.ET1);
    }

    //Metodo para el botón enviar

    public void  Enviar(View View){
        Intent canal = new Intent( this,MainActivity2.class);
        canal.putExtra("dato",ET1.getText().toString());
        startActivity(canal);
    }
}