package br.cefetrj.mg.bsi.lista01.view;

import br.cefetrj.mg.bsi.lista01.model.Exec06Model;
import javax.swing.JOptionPane;
import br.cefetrj.mg.bsi.lista01.utils.Utils;

public class Exec06  extends Utils{

    private static final String TITLE="Cálculo de IMC";
    
    
    public static void main(String[] args)  {
   
        int resp = 0;
        do {

            Exec06Model pessoa = new Exec06Model();
            pessoa.setNome(input("Informe seu nome:",TITLE));
            pessoa.setAltura(Float.parseFloat(input("Informe sua altura:",TITLE)));
            pessoa.setPeso(Float.parseFloat(input("Informe seu peso:",TITLE)));
            pessoa.setSexo(input("Informe seu sexo(S/M):",TITLE));
            pessoa.setIdade(Integer.parseInt(input("Informe sua idade:",TITLE)));
            print(pessoa.toString(),TITLE,false);
            resp = confirm("Deseja continuar?", TITLE);
        } while (resp == JOptionPane.YES_OPTION);

    }

}
