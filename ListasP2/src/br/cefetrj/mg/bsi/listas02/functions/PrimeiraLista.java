/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.listas02.functions;
import static br.cefetrj.mg.bsi.utils.Utils.*;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author cristian
 * 
 * 1. Faça um programa que solicite ao usuário entrar com dois valores inteiros utilizando
o JOptionPane. Calcule a soma destes dois números e exiba o resultado utilizando o
JOptionPane.
2. Desenvolva um programa em Java que receba o ano de nascimento de uma pessoa
por interface JOoptionpane, calcule e mostre a sua idade, e também verifique e
mostre se essa pessoa já tem idade para votar (16 anos ou mais) e se tem idade para
obter a Carteira Nacional de Habilitação (18 anos ou mais).
3. Faça um programa em Java que solicite ao usuário um conjunto de 10 valores
inteiros e armazene os mesmos em um vetor. Utilize a classe JOptionPane para
solicitar estes valores ao usuário. Em seguida faça o produto destes valores e
armazene o resultado em uma variável qualquer, por fim, imprima este valor na tela.
4. Um certo produto custa R$ 100,00, e é concedido um desconto de 10% se a compra
for acima de 10 unidades, 15% se acima de 40 unidades e 25% se acima de 100
unidades. Dada a quantidade de produtos comprados por um cliente, elaborar um
programa para calcular e mostrar o valor total que deveria ser pago (sem desconto),
o valor do desconto e o valor total pago (com desconto). Tanto as entradas quanto as
saídas devem usar Joption pane.
 */
public class PrimeiraLista {
    
    public static void exercicio1(){
        int n1=Integer.parseInt(input("Informe o 1º número:"));
        int n2=Integer.parseInt(input("Informe o 2º número:"));
        print("A soma é "+(n1+n2));
        
    }
    public static void exercicio2(){
        try {
            Date dataNascimento=textToDate(input("Informe sua data de nascimento(dd/mm/aaaa):"));
            int diaNascimento=dataNascimento.getDay();
            int mesNascimento=dataNascimento.getMonth();
            int anoNascimento=dataNascimento.getYear();
            
            Date hoje=new Date();
            int diaHoje=hoje.getDay();
            int mesHoje=hoje.getMonth();
            int anoHoje=hoje.getYear();
            
            int diffAno=anoHoje-anoNascimento;
            String msg="";
            msg="Sua idade é "+diffAno+" anos.\n";
            if(diffAno >= 16)
                msg+="Pode Votar.\n";
            if(diffAno >=18)
                msg+="Pode tirar habilitação.\n";
            
            print(msg);
            
            
            
            
            
        } catch (ParseException ex) {
            print("Informe um data válida.");
        }
    }
    public static void exercicio3(){
        int nums[]=new int[10];
        int produto = 1;
        for (int i = 0; i < 10; i++) {
            nums[i]=Integer.parseInt(input("Informe o "+(i+1)+" º:"));
            produto*=nums[i];
        }
        print("O Produto dos 10 números foi de "+produto);
    }
    public static void exercicio4(){
        float valor=Float.parseFloat(input("Informe o valor do produto:"));
        int qtd=Integer.parseInt(input("Informe a quantidade:"));
        float total=valor*qtd;
        float desconto=0;
        if(qtd>=10)
            desconto=0.1f;
        else if(qtd >=40)
            desconto=0.15f;
        else
            desconto=0.25f;
        String msg="Valor da compra sem desconto R$"+total+".\n";
        msg+="Valor da compra com desconto de "+(desconto*100)+"% é R$"+(total*(1-desconto));
        print(msg);
            
        
    }
    
    
}
