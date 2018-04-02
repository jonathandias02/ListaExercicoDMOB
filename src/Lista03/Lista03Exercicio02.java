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
public class Lista03Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("-----TABUADA DE 0-----");

        for (int a = 0; a <= 9; a++) {
            for (int b = 1; b <= 10; b++) {
                if (b == 10 && a != 9) {
                    System.out.println(a + " x " + b + " = " + (a * b));
                    System.out.println("-----TABUADA DE " + (a + 1) + "-----");
                } else {
                    System.out.println(a + " x " + b + " = " + (a * b));
                }
            }
        }

    }

}
