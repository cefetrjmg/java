/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.dao;

import br.cefetrj.mg.bsi.lista01.model.Exec20Model;
import java.util.ArrayList;

/**
 *
 * @author aluno-8
 */
public class Exec20DAO {

    /*
        Foi declarado um array estático para não criar um array list cada instanciação, pois no momento a turma não está vendo banco de dados.
    */
    private static final ArrayList<Exec20Model> pacientes = new ArrayList<>();

    public static ArrayList<Exec20Model> getPacientes() {
        return pacientes;
    }

    public String add(Exec20Model paciente) {
        try {
            pacientes.add(paciente);
            return "Paciente paciente inserido com sucesso!!!";
        } catch (Exception e) {
            return "Erro ao inserir paciente:" + e.getMessage();
        }

    }

    //Funções para gerar o relatório.
    public int getTotal() {
        return pacientes.size();
    }

    public float mediaDeIdadeDosHomens() {
        float media = 0, soma = 0;
        int qtd = 0;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente = pacientes.get(i);
            if (paciente.getSexo().equalsIgnoreCase("m")) {
                qtd++;
                soma += paciente.getIdade();
            }
        }
        media = soma / qtd;
        return media;
    }

    public int qtdDeMulheresComAlturaEntre160E170EPesoAcimaDe70KG() {
        int qtd = 0;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente = pacientes.get(i);
            if (paciente.getSexo().equalsIgnoreCase("f") && paciente.getAltura() > 1.6 && paciente.getAltura() < 1.70 && paciente.getPeso() > 70) {
                qtd++;
            }

        }
        return qtd;
    }

    public int qtdDePessoasComIdadeEntre18E25() {
        int qtd = 0;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente = pacientes.get(i);
            if (paciente.getIdade() > 18 && paciente.getAltura() < 25) {
                qtd++;
            }
        }
        return qtd;
    }

    public String nomeDoPacienteMaisVelho() {
        String nome = "";
        int maiorIdade = 0;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente = pacientes.get(i);
            if (paciente.getIdade() > maiorIdade) {
                maiorIdade = paciente.getIdade();
                nome = paciente.getNome();
            }
        }
        return nome;
    }

    public String nomeDaMulherMaisBaixa() {
        String nome = "";
        int menorAltura = Integer.MAX_VALUE;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente = pacientes.get(i);
            if (paciente.getSexo().equalsIgnoreCase("f") && paciente.getAltura() < menorAltura) {
                menorAltura = paciente.getIdade();
                nome = paciente.getNome();
            }
        }
        return nome;
    }

    public String getIMCPorPaciente() {
        String rel = "";
        float imc = 0f;
        for (int i = 0; i < getTotal(); i++) {
            Exec20Model paciente = pacientes.get(i);
            imc = (float) (paciente.getPeso() / Math.pow(paciente.getAltura(), 2));
            rel += "Nome:" + paciente.getNome() + " IMC:" + imc + "\n";
        }

        return rel;
    }

}
