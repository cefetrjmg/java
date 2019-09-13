package br.cefetrj.mg.bsi.lista01.model;

public class Exec08Model {
    private String titulo;
    private float preco;
    private int diasAlug;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getDiasAlug() {
        return diasAlug;
    }

    public void setDiasAlug(int diasAlug) {
        this.diasAlug = diasAlug;
    }

    public float getPrecoAluguel(){
        return this.preco * this.diasAlug;
    }    
    
    @Override
    public String toString(){
        float tot = getPrecoAluguel();
        
        return "Total a pagar: R$ " + tot;
    }
}
