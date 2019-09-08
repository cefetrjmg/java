/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.view;

import javax.swing.JOptionPane;
import br.cefetrj.mg.bsi.lista01.utils.Utils;

/**
 *
 * @author cristian
 */
public class Exec06  extends Utils{

    /**
     * @param args the command line arguments
     */
    private static final String TITLE="Cálculo de IMC";
    
    
    public static void main(String[] args)  {
        // TODO code application logic here
        int resp = 0;
        do {
            Exec06 pessoa = new Exec06();
            
            resp = confirm("Deseja continuar?", TITLE);
        } while (resp == JOptionPane.YES_OPTION);

    }

}
