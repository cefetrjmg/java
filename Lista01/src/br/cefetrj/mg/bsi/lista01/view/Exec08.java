package br.cefetrj.mg.bsi.lista01.view;

import br.cefetrj.mg.bsi.lista01.model.Exec08Model;
import javax.swing.JOptionPane;
import static br.cefetrj.mg.bsi.lista01.utils.Utils.confirm;
import static br.cefetrj.mg.bsi.lista01.utils.Utils.input;
import static br.cefetrj.mg.bsi.lista01.utils.Utils.print;

public class Exec08 {
    
    private static final String TITLE="Locadora";

    public static void main(String[] args) {
       int resp = 0;
       
       do{
           Exec08Model fita = new Exec08Model();
           
           fita.setTitulo(input("Informe o título da fita:",TITLE));
           fita.setPreco(Float.parseFloat(input("Informe o preço:",TITLE)));
           fita.setDiasAlug(Integer.parseInt(input("Digite o nº de dias que a fita foi alugada: ", TITLE)));
           print(fita.toString(),TITLE,false);
           
           resp = confirm("Deseja continuar?", TITLE);
       }while(resp == JOptionPane.YES_OPTION);
    }
    
}
