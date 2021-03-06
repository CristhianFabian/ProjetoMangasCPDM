package com.example.appmanga;

public class Manga {

    public int id;
    public String titulo, autor;
    public Genero genero;


    public Manga() {

    }

    public Manga(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public Manga(int id, String titulo, String autor, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return titulo + '\n' + autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
