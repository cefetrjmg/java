package br.cefetrj.mg.bsi.lista01.view;

import java.util.Scanner;

public class Exec05 { 
    public static void main(String[] args) { 
        int meta; 
        int valorVendas; 
        String desempenho; 
        int bonus; 
        Scanner scanner =new Scanner(System.in);
        System.out.println("Meta de vendas? ");
        meta = scanner.nextInt(); 
        System.out.println("Total de vendas realizadas? ");
        valorVendas = scanner.nextInt(); 
        desempenho = "insatisfatorio"; 
        bonus = 0; 
        if(valorVendas >= 2 * meta) { 
            desempenho = "excelente!"; 
            bonus = valorVendas/10; 
        } else if(valorVendas >= meta) { 
            desempenho = "satisfatorio"; 
            bonus = valorVendas/20; 
        } 
        System.out.println("Seu desempenho eh: " + desempenho); 
        System.out.println("Seu bonus eh: " + bonus); 
    } 
}