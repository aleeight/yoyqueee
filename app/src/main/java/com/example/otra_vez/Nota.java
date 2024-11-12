package com.example.otra_vez;

public class Nota {
    private String Titulo;
    private String Cuerpo;

    public Nota(String Titulo, String Cuerpo) {

    }

    {
    this.Titulo = Titulo;
    this.Cuerpo = Cuerpo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setCuerpo(String cuerpo) {
        this.Cuerpo = cuerpo;
    }
}

