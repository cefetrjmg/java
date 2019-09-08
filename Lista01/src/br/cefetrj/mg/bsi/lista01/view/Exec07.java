/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.view;


import br.cefetrj.mg.bsi.lista01.model.Exec07Model;
import br.cefetrj.mg.bsi.lista01.utils.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author Maurício
 */
public class Exec07 extends Utils {
    
    private static final String TITLE="Livros";

    public static void main(String[] args) {
        int resp = 0;
        
        do{
            Exec07Model livro = new Exec07Model();
            
            livro.setNome(input("Informe o nome do livro: ", TITLE));
            
            resp = confirm("Deseja continuar?", TITLE);
        }while(resp == JOptionPane.YES_OPTION);
    }
    
}
