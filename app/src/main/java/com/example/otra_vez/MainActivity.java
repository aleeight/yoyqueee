package com.example.otra_vez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.w3c.dom.Notation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //declaracion de variables

     EditText txtTitulo, txtCuerpo;
     Button btnAgregarNota,btnEliminarNota;

     ListView listView;
     ArrayList<String> Notas = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo.findViewById(R.id.txtTitulo);
        txtCuerpo.findViewById(R.id.txtCuerpo);
        btnAgregarNota.findViewById(R.id.btnAgregarNota);
        btnEliminarNota.findViewById(R.id.btnEliminarNota);
        listView.findViewById(R.id.listNota);



    }

    //funcionanalidad 1 agregar Nota

    public void agregarNota(View view);{

    }
}