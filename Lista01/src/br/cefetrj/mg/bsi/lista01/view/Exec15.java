package br.cefetrj.mg.bsi.lista01.view;

import br.cefetrj.mg.bsi.lista01.model.Exec15Model;

public class Exec15 {

        Exec15Model d = new Exec15Model();

        /**
         * Retorna true se em 10 jogadas, 5 ou mais vezes se obteve a face 6.
     * @return 
         */
        public boolean teste10jogadas() {
            int nFaces6 = 0;
            for (int i = 0; i < 10; ++i) {
                d.jogar();
                if (d.face() == 6) {
                    nFaces6 = nFaces6 + 1; 
                }
            }
            return nFaces6 >= 5;
        }
        
        public static void main(String[] args) {
            Exec15 td = new Exec15();
            int total = 0;
            for (int i = 0; i < 1000000; ++i) {
                if (td.teste10jogadas()) {
                    total = total + 1;
                }
            }
            System.out.println();
        }
}
