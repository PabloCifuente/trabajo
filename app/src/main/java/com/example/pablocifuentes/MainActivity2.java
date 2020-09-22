package com.example.pablocifuentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView TW1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TW1 = (TextView)findViewById(R.id.TW1);

        String dato = getIntent().getStringExtra("dato");
        TW1.setText("hola " + dato);
    }

    //Metodo para regresar
    public void regresar(View View){
        Intent I = new Intent( this,MainActivity.class);
        startActivity(I);
    }
}