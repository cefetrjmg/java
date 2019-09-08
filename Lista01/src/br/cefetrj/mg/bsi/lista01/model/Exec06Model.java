/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.model;

/**
 *
 * @author cristian
 */
public class Exec06Model {
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        float imc = calcular();
        String situacao="";
        if(imc <=18.5)
            situacao="abaixo do peso normal.";
        else if(imc <=25)
            situacao="com peso normal.";
        else if(imc <=30)
            situacao="acima do peso normal.";
        else
            situacao="com obesidade.";
        return "Você, "+nome+" está "+situacao;
    }
    
    
    public float calcular(float peso, float alt){
        
        float imc;
        
        imc = peso / (alt*alt);
        
        return imc;
        
    }
    
}
