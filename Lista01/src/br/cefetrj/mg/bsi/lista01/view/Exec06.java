/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.view;

import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Exec06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resp = 0;
        do {
            Exec06 pessoa = new Exec06();
            resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Cálculo de IMC", JOptionPane.YES_NO_OPTION);
        } while (resp == JOptionPane.YES_OPTION);

    }

}
