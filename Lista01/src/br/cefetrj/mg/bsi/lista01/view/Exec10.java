package br.cefetrj.mg.bsi.lista01.view;

public class Exec11 {

    public static void main(String[] args) {
        public class Cart {
            private String name;
            private String naipe;

            public String getName() {
                return name;
            }

            public void setName(String nome) {
                this.nome = name;
            }

            public String getNaipe() {
                return naipe;
            }

            public void setNaipe(String naipe) {
                this.naipe = naipe;
            }   
        }
    }
    
    public class Deck {

        private final List<Cart> cartsList;

        public Deck() {
            cartsList = new ArrayList<>();

            String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
            int pos = 0;
            Cart c;

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
        
        public void printDeck(){
            StringBuilder sb = new StringBuilder();
            
            cartsList.forEach((c) -> {
                sb.append("Carta: ").append(c.getName()).append(" | Naipe: ").append(c.getNaipe()).append("\n");
            });
            
            System.out.println(sb.toString());
        }
    }

}
