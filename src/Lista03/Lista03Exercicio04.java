/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

/**
 *
 * @author Jonathan
 */
public class Lista03Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("NUMEROS ENTRE 1000 E 1999 QUE "
                + "DIVIDIDOS POR 11 TEM RESTO 5");
        for (int i = 1000; i < 2000; i++) {
            if (i % 11 == 5) {
                System.out.println(i + " / 11 = " + (i - 5) / 11 + " e resta 5");
            }
        }

    }

}
