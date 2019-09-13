package br.cefetrj.mg.bsi.lista01.view;

import br.cefetrj.mg.bsi.lista01.model.Exec16Model;
import java.util.Scanner;


public class Exec16 {

    public static void main(String[] args) {
       int n; // número de discos
       
       Exec16Model HanoiIterativo = new Exec16Model();
 
        // recebe o nú  mero de discos digitado pelo usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        n = entrada.nextInt();
 
        // executa o algoritmo iterativo das Torres de Hanói
        HanoiIterativo.hanoi(n);
    }
    
}
