package br.edu.unisep.biblioteca.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private String editora;
    private Date ano;

    public Livro(int id, String titulo, Autor autor, String editora, Date ano)
    {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        SimpleDateFormat dataSimple = new SimpleDateFormat("dd/MM/yyyy");
        return dataSimple.format(this.ano);
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Override
    public String toString()
    {
        return "("+this.getId()+")"+this.getTitulo();
    }
}
