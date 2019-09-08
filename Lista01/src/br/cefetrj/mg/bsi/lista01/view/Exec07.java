/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.view;


import br.cefetrj.mg.bsi.lista01.dao.Exec07DAO;
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
        int resp=-1;
        do{
            
          resp =confirm("Deseja continuar?", TITLE);
        }while(resp==JOptionPane.YES_OPTION);
        
    }
    
}
