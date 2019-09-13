package br.cefetrj.mg.bsi.lista01.view;

import java.util.*; 

public class CartasMini7 { 
public static void main(String[] args) {

    final int NÚMERO_DE_CARTAS = 5; 
    Baralho baralho = new Baralho(); 
    baralho.baralhar(); 
    Carta reiDeCopas = new Carta(Carta.REI, Carta.COPAS); 
    Mao mao = new Mao(); 
    
    for(int i = 0; i < NÚMERO_DE_CARTAS; i++) { 
        mao.adicionar(baralho.pegaCarta()); 
    }

    Iterator dedo = mao.iterator();
}