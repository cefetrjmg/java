package br.cefetrj.mg.bsi.lista01.view;

import java.util.Scanner;

/**
 *
 * @author Maurício
 */
public class Exec04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] vet = new int[10];
        
        for(int i = 0; i < vet.length; i++){
            System.out.println("Digite um número: ");
            vet[i] = in.nextInt();
        }
        
        for(int i = vet.length - 1; i >= 0; i--){
            System.out.print(vet[i] + "|");
        }
    }
    
}
