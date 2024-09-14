package Biblioteca.Models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emprestimo {
    private int idEmprestimo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(int idEmprestimo, Date dataEmprestimo, Date dataDevolucao, Livro livro, Usuario usuario)
    {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getDataEmprestimo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(dataEmprestimo);
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(dataDevolucao);
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString()
    {
        return "---------------------\nEMPRESTIMO:\n" +
                this.idEmprestimo + " - (" + this.getDataEmprestimo() + " - " + this.getDataDevolucao() + ")\n" +
                this.usuario.toString() + " - " + this.livro.toString() + "\n\n";
    }
}
