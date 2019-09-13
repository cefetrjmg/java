package br.cefetrj.mg.bsi.lista01.view;

import java.util.*; 

public class Exec11 { 
public static void main(String[] args) {

    final int NÚMERO_DE_CARTAS = 5; 
    Baralho baralho = new Baralho(); 
    baralho.baralhar(); 
    Carta reiDeCopas = new Carta(Carta.REI, Carta.COPAS); 
    Mao mao = new Mao(); 
    
    for(int i = 0; i < NÚMERO_DE_CARTAS; i++) { 
        mao.adicionar(Baralho.pegaCarta()); 
    }

    Iterator dedo = mao.iterator();
}

    private static class Baralho {

        public Baralho() {
        }

        private void baralhar() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        static String pegaCarta(){
         return ""   ;
        }
    }

    private static class Carta {
        static final int REI=1;
        static final int COPAS=2;
        public Carta() {
        }

        private Carta(int REI, int COPAS) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Mao {

        public Mao() {
        }

        private Iterator iterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void adicionar(String pegaCarta) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
