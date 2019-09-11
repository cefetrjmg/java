/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mg.bsi.lista01.dao;

import br.cefetrj.mg.bsi.lista01.model.Exec17Model;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Exec17DAO {
    private static final  ArrayList<Exec17Model> pessoas =new ArrayList<>();
    public String inserir(Exec17Model pessoa){
        try {
            pessoas.add(pessoa);
            return "1-Pessoa inserida com sucesso!";
        } catch (Exception e) {
            return "0-"+e.getMessage();
        }
        
    }
    public String relatorio(){
        int contH=0;
        for (Exec17Model p : pessoas) {
            if(p.getSexo().equalsIgnoreCase("m") && p.getIdade()>=18)
                contH++;
            
        }
        return ("Total de homens é de "+contH+" e de mulheres é de "+(pessoas.size()-contH)+".");
    }
    
}
