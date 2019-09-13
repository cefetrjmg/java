package br.cefetrj.mg.bsi.lista01.view;

import java.util.Scanner;

public class Exec02 {

    static boolean isPrimo(int n) {
        int i;
	
        for(i = 2; i < n; i++) {
            if(n % i == 0) 
		return false;
            }
		
	return true;
		
    }
	
    public static void main(String[] args) {
		
        int num;
		
	Scanner in = new Scanner(System.in);
		
        System.out.println("Digite um número para verificar se é primo : ");
	num = in.nextInt();
		
	System.out.println(isPrimo(num));
		
    }
    
}
