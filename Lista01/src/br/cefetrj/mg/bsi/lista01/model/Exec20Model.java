/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.model;

import java.util.ArrayList;

/**
 *
 * @author aluno-2
 */
public class Exec20Model {
    private String nome;
    private String sexo;
    private float peso;
    private int idade;
    private  float altura;
    private static ArrayList<Exec20Model> pacientes =new ArrayList<>();

    public static ArrayList<Exec20Model> getPacientes() {
        return pacientes;
    }

    public static void setPacientes(ArrayList<Exec20Model> pacientes) {
        Exec20Model.pacientes = pacientes;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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
    //Funções para gerar o relatório.
    public int getTotal(){
        return pacientes.size();
    }
    public float mediaDeIdadeDosHomens(){
        float media=0, soma=0;
        int qtd=0;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente=pacientes.get(i);
            if(paciente.sexo.equalsIgnoreCase("m")){
                qtd++;
                soma+=paciente.idade;
            }
        }
        media=soma/qtd;
        return media;
    }
    
    
}
