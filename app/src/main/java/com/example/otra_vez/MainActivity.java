package com.example.otra_vez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Notation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //declaracion de variables

    EditText txtTitulo, txtCuerpo;
    Button btnAgregarNota, btnEliminarNota;

    ListView listView;
    ArrayList<Nota> Notas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo.findViewById(R.id.txtTitulo);
        txtCuerpo.findViewById(R.id.txtCuerpo);
        btnAgregarNota.findViewById(R.id.btnAgregarNota);
        btnEliminarNota.findViewById(R.id.btnEliminarNota);
        listView.findViewById(R.id.listNota);
        ListView listNotas;
        ListView listado;

         cargarNotas();
    }

    //funcionanalidad 1 agregar Nota

    public void agregarNota() {
        String Titulo = txtTitulo.getText().toString();
        String Cuerpo = txtCuerpo.getText().toString();

        if (Titulo.isEmpty() || Titulo.isEmpty())
        {
            Toast.makeText(this, "los campos no pueden estar vacios", Toast.LENGTH_SHORT).show();

        } else {

            Nota note = new Nota(Titulo, Cuerpo);
            Notas.add(note);
            Toast.makeText(this, "Nota creada correctamente", Toast.LENGTH_SHORT).show();
            cargarNotas(); // Actualiza la lista
        }
        if (Notas.size() > 0){
            Toast.makeText(this, "Nota creada correctamente", Toast.LENGTH_SHORT).show();
            cargarNotas(); // NUEVO METODO PARA CARGAR DATOS LUEGO DE CREAR NOTA

        } else  {
            Toast.makeText(this, "La nota no se pudo guardar :(", Toast.LENGTH_SHORT).show();
        }
    }


    }
