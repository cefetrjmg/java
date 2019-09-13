package br.cefetrj.mg.bsi.lista01.view;

import java.util.Scanner;

public class Exec03 {

    static void ordenar(int elementos[]) {
        int cont1, cont2, aux;
		
            for(cont1 = 0; cont1 < 10; cont1++) {
                for(cont2 = 0; cont2 < 9; cont2++) {
                    if(elementos[cont2] > elementos[cont2+1]) {
                        aux = elementos[cont2];
                        elementos[cont2] = elementos[cont2+1];
                        elementos[cont2+1] = aux;
                    }
                }
            }
    }

    public static void main(String[] args) {
        Scanner vet = new Scanner(System.in);
		
        int elementos[] = new int[10];
		
        for(int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº Numero : ", i+1);
            elementos[i] = vet.nextInt();
	}
		
        ordenar(elementos);
		
        System.out.println("Numeros Ordenados: ");
	
        for (int numero : elementos){
            System.out.println(numero);
	}
        
    }
    
}
