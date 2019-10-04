/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.listas02.view;

import static br.cefetrj.mg.bsi.utils.Utils.*;
import javax.swing.JOptionPane;
import static br.cefetrj.mg.bsi.listas02.functions.PrimeiraLista.*;
/**
 *
 * @author cristian
 */
public class PrimeiraLista {

    private static final String MENU = "DIGITE QUAL EXERCÍCIO QUER EXECUTAR:";
    private static final String TITLE = "PRIMEIRA LISTA DA P2";

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        do {
            int opcao = Integer.parseInt(input(MENU));
            switch (opcao) {
                case 1:exercicio1();
                    break;
                case 2:exercicio2();
                    break;
                case 3:exercicio3();
                    break;
                case 4:exercicio4();
                    break;
                default:
                    print("Opção inválida", TITLE, false);

            }

        } while (confirm("Deseja continuar?", TITLE) == JOptionPane.YES_OPTION);

    }

}
