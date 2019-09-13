package br.cefetrj.mg.bsi.lista01.dao;

import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import java.util.ArrayList;

public class Exec07DAO {

    public static ArrayList<Exec07Model> livros = new ArrayList<>();

    public String inserir(Exec07Model livro) {
        try {
            livros.add(livro);
            return "1-Livro adicionado com sucesso!";
        } catch (Exception e) {
            return "0-Error ao inserir livro:" + e.getMessage();
        }

    }

    public String alterar(Exec07Model livro) {
        int pos = buscar(livro.getId());
        if (pos != -1) {
            livros.set(pos, livro);
            return "1-Livro atualizado com sucesso!";
        }
        return "0-Livro não encontrado";

    }

    public String excluir(int id) {

        int pos = buscar(id);
        if (pos != -1) {
            livros.remove(pos);
            return "1-Livro removido com sucesso!";
        }
        return "0-Livro não encontrado!";

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
    public boolean verificar(int id){
        return buscar(id) != -1;
    }

}
