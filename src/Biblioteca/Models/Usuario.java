package Biblioteca.Models;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String telefone;

    public Usuario(int idUsuario, String nome, String email, String telefone)
    {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString()
    {
        return "(" + this.getIdUsuario() + ")" + this.getNome();
    }
}
