package br.cefetrj.mg.bsi.lista01.dao;

import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import java.util.ArrayList;

public class Exec07DAO implements DAO {

    public static ArrayList<Exec07Model> livros = new ArrayList<>();
    private static  int AUTO_INCREMENT=1;
    private Exec07Model livro=null;
    public boolean verificar(int id) {
        return getPos(id) != -1;
    }

    @Override
    public String inserir(Object o) {
        try {
            livro=(Exec07Model) o;
            livro.setId(AUTO_INCREMENT++);
            livros.add(livro);
            return "1-Livro adicionado com sucesso!";
        } catch (Exception e) {
            return "0-Error ao inserir livro:" + e.getMessage();
        }
    }

    @Override
    public String atualizar(Object o) {
        livro=(Exec07Model) o;
        int pos=getPos(livro.getId());
        if (livro != null) {
            livros.set(pos, livro);
            return "1-Livro atualizado com sucesso!";
        }
        return "0-Livro não encontrado";
    }

    @Override
    public String excluir(int id) {
       livro= (Exec07Model) buscar(id);
        if (livro != null) {
            livros.remove(livro);
            return "1-Livro removido com sucesso!";
        }
        return "0-Livro não encontrado!";
    }

    @Override
    public Object buscar(int id) {
        
        for (int i = 0; i < livros.size(); i++) {
            Exec07Model l = livros.get(i);
            if (id==l.getId() ) {
                return l;
            }
        }
        return null;
    }

    @Override
    public String listar() {
        String l = "";
        for (int i = 0; i < livros.size(); i++) {
            Exec07Model livro = livros.get(i);
            l += "ID:" + livro.getId() + " ISBN:" + livro.getISBN() + " Autor:" + livro.getAutor() + " Título:" + livro.getTitulo();
            l += "\n";
        }
        return l;
    }
    public int  getPos(int id){
         for (int i = 0; i < livros.size(); i++) {
            Exec07Model l = livros.get(i);
            if (id==l.getId() ) {
                return i;
            }
        }
        return -1;
    }
}
