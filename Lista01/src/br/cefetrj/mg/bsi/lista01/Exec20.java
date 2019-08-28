/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01;

import br.cefetrj.mg.bsi.lista01.model.Exec20Model;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno-2
 */
public class Exec20 {
    public static void main(String[] args) {
        Exec20Model paciente =new Exec20Model();
        String flag="";
        while(!flag.equalsIgnoreCase("fim")){
            paciente.setNome(JOptionPane.showInputDialog(null,"Informe seu nome:"));
            paciente.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua altura:")));
            paciente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade:")));
            paciente.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null,"Informe seu peso:")));
            paciente.setSexo(JOptionPane.showInputDialog(null,"Informe seu sexo (M/F):"));
            paciente.getPacientes().add(paciente);
            flag=JOptionPane.showInputDialog(null,"Informe 'fim' para encerrar:");
        }
    }
}
