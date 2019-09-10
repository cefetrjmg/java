package br.cefetrj.mg.bsi.lista01.view;

import java.util.Scanner;

/**
 *
 * @author Maurício
 */
public class Exec17_2 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int idade, masc = 0, fem = 0, sexo;
       
       for(int i = 0; i < 5; i++){
           
           System.out.println("\n Digite seu sexo 1 - [M] ou 2 - [F] : ");
           sexo = in.nextInt();
           
           while(sexo != 1 && sexo != 2){
               System.out.println("INVÁLIDO ! Digite seu sexo novamente. 1 - [M] ou 2 - [F] : ");
               sexo = in.nextInt();
           }
           
           System.out.println("Digite sua idade : ");
           idade = in.nextInt();

           if(sexo == 1 && idade>= 18){
               masc++;
           }else if(sexo == 2 && idade >= 18){
               fem++;
           }
       }
       
        System.out.println("\n");
       System.out.println("Quantidade de homens maiores de idade: " + masc);
       System.out.println("Quantidade de mulheres maiores de idade: " + fem);
    }
    
}
