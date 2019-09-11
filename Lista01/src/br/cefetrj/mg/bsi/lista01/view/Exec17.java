/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.view;

import br.cefetrj.mg.bsi.lista01.utils.Utils;
import br.cefetrj.mg.bsi.lista01.dao.Exec17DAO;
import br.cefetrj.mg.bsi.lista01.model.Exec17Model;

/**
 *
 * @author cristian
 */
public class Exec17 extends Utils {

    /**
     * @param args the command line arguments
     */
    private static final int MAX = 100;
    private static final String TITLE = "Cadastro de pessoas";
    static Exec17DAO dao=null;
    static Exec17DAO getDAO(){
        if(dao == null)
            return dao= new Exec17DAO();
        return dao;
    }
    static void inserir() {
       
        
        for (int i = 0; i < MAX; i++) {
            Exec17Model m = new Exec17Model();
            m.setIdade(Integer.parseInt(input("Informe a idade:")));
            m.setSexo(input("Informe o sexo(M/F):"));
            String response = getDAO().inserir(m);
            String str[] = response.split("-");
            String cod = str[0];
            String msg = str[1];
            if (cod.equalsIgnoreCase("0")) {
                print(msg, TITLE, true);
            } else {
                print(msg, TITLE);
            }

        }
    }
    static void listar(){
        print(getDAO().relatorio());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        inserir();
        listar();
    }

}
