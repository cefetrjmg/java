package br.cefetrj.mg.bsi.lista01.model;

public class Exec15Model {
    
    private int resultado;
    
    public void jogar() {
        resultado = (int) (Math.random() * 6) + 1;
    }
        
    public int face() {
        return resultado;
    }
}
