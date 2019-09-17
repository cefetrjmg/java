/*package br.cefetrj.mg.bsi.lista01.view;

import br.cefetrj.mg.bsi.lista01.dao.Exec07DAO;
import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import br.cefetrj.mg.bsi.lista01.utils.Utils;
import javax.swing.JOptionPane;

public class Exec07_view extends Utils {

    public static final String TITLE = "Sistema de biblioteca";
    public static final String MENU = "1-Inserir\n2-Alterar\n3-Excluir\n4-Listar";

    public static void main(String[] args) {
        Exec07DAO dao = new Exec07DAO();
        String msg = "", response = "";
        int resp = -1, id = 1, op = -1, codOp = -1;

        do {
            Exec07Model livro = new Exec07Model();
            op = Integer.parseInt(input(MENU, TITLE));
            switch (op) {
                case 1:
                    livro.setId(id++);
                    livro.setISBN(Integer.parseInt(input("Informe o nº ISBN do livro: ", TITLE)));
                    livro.setTitulo(input("Informe o título do livro: ", TITLE));
                    livro.setAutor(input("Informe o nome do autor: ", TITLE));
                    //A resposta é no seguinte padrão <(1 ou 0)>-<a mensagem>
                    response = dao.inserir(livro);
                    break;
                case 2:
                    livro.setId(Integer.parseInt(input("Informe a ID do livro para a alteração:", TITLE)));
                    if (dao.verificar(livro.getId())) {
                        livro.setISBN(Integer.parseInt(input("Informe o nº ISBN do livro: ", TITLE)));
                        livro.setTitulo(input("Informe o título do livro: ", TITLE));
                        livro.setAutor(input("Informe o nome do autor: ", TITLE));
                        response = dao.alterar(livro);
                    } else {
                        response = "0-Livro não encontrado!";
                    }

                    break;
                case 3:
                    response = dao.excluir(Integer.parseInt(input("Informe o ID:", TITLE)));
                    break;
                case 4:
                    print(dao.listar(), TITLE, false);
                    break;
            }
            if (!response.equals("")) {
                String str[] = response.split("-");
                codOp = Integer.parseInt(str[0]);
                msg = str[1];
                //Caso retorne 1 é porque a operação foi realizada com sucesso.
                if (codOp == 1) {
                    //é passado falso somente para enviar um mensagem com icone de erro.
                    print(msg, TITLE, false);
                } else {
                    print(msg, TITLE, true);
                }
                response = "";
            }

            resp = confirm("Deseja continuar?", TITLE);
        } while (resp == JOptionPane.YES_OPTION);
    }

}
*/