/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Exec19 {

    /**
     * @param args the command line arguments
     */
    //constante para limitar a quantidade de números a serem sorteados.
    private static final int MAX = 100;
    String msg="";
    public static void main(String[] args) {
        // TODO code application logic here
        boolean achou = false;
        int num = 0, qtdAlternativas = 0, numSorteado = 0;
        //Classe para gerar números aleatórios.
        Random r = new Random();
        numSorteado = r.nextInt(MAX);
        //Enquanto não acertar será repetido.
        while (!achou) {
            //Sortea números entre 0 e o valor definido no 'MAX'.
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
            if (num == numSorteado) {
                JOptionPane.showMessageDialog(null, "Parabéns você tentou " + qtdAlternativas + " vezes.");
                achou = true;
            } else {
                qtdAlternativas++;
                if(num < numSorteado)
                    JOptionPane.showMessageDialog(null, "Número é menor!");
                else
                    JOptionPane.showMessageDialog(null, "Número é maior!");
                
                
            }
        }

    }

}
