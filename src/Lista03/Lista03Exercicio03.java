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
public class Lista03Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float soma = 0;
        int b = 1;
        System.out.print("Soma = ");
        for (int a = 1; a <= 99; a += 2) {
            soma += a / b;
            if (a == 99 && b == 50) {
                System.out.println(a + "/" + b + " =");
            } else if (b % 10 == 0) {
                System.out.print(a + "/" + b + " + \n");
            } else {
                System.out.print(a + "/" + b + " + ");
            }
            b++;
        }

        System.out.println("\nA Soma é: " + soma + "\n");

    }

}
