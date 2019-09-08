/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.view;


import br.cefetrj.mg.bsi.lista01.dao.Exec07DAO;
import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import br.cefetrj.mg.bsi.lista01.utils.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author Maurício
 */
public class Exec07 extends Utils {
    public static final String TITLE="Sistema de biblioteca";
    
    public static void main(String[] args) {
        Exec07DAO dao =new Exec07DAO();
        int resp=-1, cont = 0;
        do{
            
          resp =confirm("Deseja continuar?", TITLE);
        }while(resp==JOptionPane.YES_OPTION);
        
        do{
            Exec07Model livro = new Exec07Model();
            
            livro.setId(cont++);
            livro.setISBN(Integer.parseInt(input("Informe o nº ISBN do livro: ", TITLE)));
            livro.setTitulo(input("Informe o título do livro: ", TITLE));
            livro.setAutor(input("Informe o nome do autor: ", TITLE));
            
            resp = confirm("Deseja continuar?", TITLE);
        }while(resp == JOptionPane.YES_OPTION);
    }
    
}
