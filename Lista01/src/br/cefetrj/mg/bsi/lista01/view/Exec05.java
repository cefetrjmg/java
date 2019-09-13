package br.cefetrj.mg.bsi.lista01.view;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Test { 
    public static void main(String[] args) { 
        int meta; 
        int valorVendas; 
        String desempenho; 
        int bonus; 
        meta = Entrada.in.lerInt("Meta de vendas? "); 
        valorVendas = Entrada.in.lerInt("Total de vendas realizadas? "); 
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