package br.cefetrj.mg.bsi.lista01.view;

import java.util.ArrayList;
import java.util.List;

public class Exec10 {

    static class Cart {

        private String name;
        private String naipe;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNaipe() {
            return naipe;
        }

        public void setNaipe(String naipe) {
            this.naipe = naipe;
        }
    }
static   List<Cart> cartsList;

    public static void main(String[] args) {

       
        cartsList = new ArrayList<>();

        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        int pos = 0;
        Cart c = null;

        while (pos < 4) {
            for (int i = 1; i <= 10; i++) {
                c = new Cart();
                c.setName(i + "");
                c.setNaipe(naipes[pos]);

                cartsList.add(c);
            }

            c = new Cart();
            c.setName("Valete");
            c.setNaipe(naipes[pos]);
            cartsList.add(c);
            c = new Cart();
            c.setName("Dama");
            c.setNaipe(naipes[pos]);
            cartsList.add(c);
            c = new Cart();
            c.setName("Rei");
            c.setNaipe(naipes[pos]);
            cartsList.add(c);
            c = new Cart();
            c.setName("Coringa");
            c.setNaipe("Coringa");
            cartsList.add(c);

            pos++;
        }
    }

    public void printDeck() {
        StringBuilder sb = new StringBuilder();
        
        cartsList.forEach((c) -> {
            sb.append("Carta: ").append(c.getName()).append(" | Naipe: ").append(c.getNaipe()).append("\n");
        });

        System.out.println(sb.toString());
    }


}
