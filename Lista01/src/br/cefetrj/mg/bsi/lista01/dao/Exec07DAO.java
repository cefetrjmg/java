/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.dao;

import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Exec07DAO {

    public static ArrayList<Exec07Model> livros = new ArrayList<>();

    public String inserir(Exec07Model livro) {
        try {
            livros.add(livro);
            return "ok-Livro adicionado com sucesso!";
        } catch (Exception e) {
            return "error-Error ao inserir livro:" + e.getMessage();
        }

    }

    public String alterar(Exec07Model livro) {
        int pos = buscar(livro.getId());
        if (pos != -1) {
            livros.add(pos, livro);
            return "ok-Livro atualizado com sucesso!";
        }
        return "error-Livro não encontrado";

    }

    public String excluir(int id) {

        int pos = buscar(id);
        if (pos != -1) {
            livros.remove(pos);
            return "Livro removido com sucesso!";
        }
        return "error-Livro não encontrado!";

    }

    public int buscar(int id) {
        for (int i = 0; i < livros.size(); i++) {
            Exec07Model livro = livros.get(i);
            if (livro.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public String listar() {
        String l = "";
        for (int i = 0; i < livros.size(); i++) {
            Exec07Model livro = livros.get(i);
            l += "ID:" + livro.getId() + " ISBN:" + livro.getISBN() + " Autor:" + livro.getAutor() + " Título:" + livro.getTitulo();
            l += "\n";
        }
        return l;
    }

}
