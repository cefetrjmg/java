/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.main;

import br.cefetrj.mg.bsi.lista01.model.Exec20Model;
import br.cefetrj.mg.bsi.lista01.dao.Exec20DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno-2
 */
public class Exec20 {

    public static void main(String[] args) {
        Exec20Model paciente = null;
        //Classe para persistir os objetos.
        Exec20DAO pacienteDAO =new Exec20DAO();
        String flag = "";
        while (!flag.equalsIgnoreCase("fim")) {
            //Cria uma paciente a cada loop
            paciente = new Exec20Model();
            paciente.setNome(JOptionPane.showInputDialog(null, "Informe seu nome:"));
            paciente.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe sua altura:")));
            paciente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:")));
            paciente.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu peso:")));
            paciente.setSexo(JOptionPane.showInputDialog(null, "Informe seu sexo (M/F):"));
            //Persiste o paciente.
            pacienteDAO.add(paciente);
            flag = JOptionPane.showInputDialog(null, "Informe 'fim' para encerrar:");
        }
        //Emitindo o relatório........
        String rel = "Total de pacientes é " + pacienteDAO.getTotal() + ".\n";
        rel += "A média dos homens é " + pacienteDAO.mediaDeIdadeDosHomens() + ".\n";
        rel += "A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70 KG é " + pacienteDAO.qtdDeMulheresComAlturaEntre160E170EPesoAcimaDe70KG() + ".\n";
        rel += "A quantidade de pessoas com idade entre 18 e 25 anos é " + pacienteDAO.qtdDePessoasComIdadeEntre18E25() + ".\n";
        rel += "O nome  do paciente mais velho é " + pacienteDAO.nomeDoPacienteMaisVelho() + ".\n";
        rel += "O nome da muler mais baixa é " + pacienteDAO.nomeDaMulherMaisBaixa() + ".\n";
        rel += "<<<<<<<<<<<<<<Valor do IMC por pacienteDAO>>>>>>>>>>\n";
        rel += pacienteDAO.getIMCPorPaciente();
        JOptionPane.showMessageDialog(null, rel);
    }
}
