package br.edu.unisep.biblioteca.view;

import br.edu.unisep.biblioteca.models.Autor;
import br.edu.unisep.biblioteca.models.Emprestimo;
import br.edu.unisep.biblioteca.models.Livro;
import br.edu.unisep.biblioteca.models.Usuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        Usuario lucas = new Usuario(1, JOptionPane.showInputDialog("Digite seu nome: "),JOptionPane.showInputDialog("Digite seu email: "),JOptionPane.showInputDialog("Digite seu telefone: "));
        Autor autor = new Autor(1,"Scott Cawthon");

        Calendar calendar = Calendar.getInstance();
        Calendar calendarFim = Calendar.getInstance();

        calendar.set(2015,12,05);

        Livro livro1 = new Livro(1,"Os Olhos Prateados",autor,"Intrinseca",calendar.getTime());
        Livro livro2 = new Livro(2,"Os Distorcidos",autor,"Intrinseca",calendar.getTime());
        Livro livro3 = new Livro(3,"A ultima Porta",autor,"Intrinseca",calendar.getTime());

        calendar.set(2024,9,13);
        calendarFim.set(2024,9,20);

        Emprestimo emprestimo1 = new Emprestimo(1,calendar.getTime(),calendarFim.getTime(),livro1,lucas);
        Emprestimo emprestimo2 = new Emprestimo(2,calendar.getTime(),calendarFim.getTime(),livro2,lucas);
        Emprestimo emprestimo3 = new Emprestimo(3,calendar.getTime(),calendarFim.getTime(),livro3,lucas);

        emprestimos.add(emprestimo1);
        emprestimos.add(emprestimo2);
        emprestimos.add(emprestimo3);

        String mensagem = "";
        for (int i = 0; i < emprestimos.size(); i++) {
            mensagem += emprestimos.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}