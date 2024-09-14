package Biblioteca.Models;

public class Autor {
    private int idAutor;
    private String nome;

    public Autor(int idAutor, String nome)
    {
        this.idAutor = idAutor;
        this.nome = nome;
    }
    public int getIdAutor()
    {
        return idAutor;
    }
    public String getNome()
    {
        return nome;
    }
    public void setIdAutor(int idAutor)
    {
        this.idAutor = idAutor;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
