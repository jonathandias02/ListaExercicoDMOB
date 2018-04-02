/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista03Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            int n, somap = 0, somai = 0;
            System.out.println("--PARA-FINALIZAR-ENTRE-COM-NUMERO-MAIOR-QUE-1000--");
            System.out.println("Digite varios numeros inteiros positivos!");
            do {
                n = sc.nextInt();
                if (n <= 1000) {
                    if (n < 0) {
                        System.out.println("Numero Negativo!\nDigite Numeros "
                                + "Positivos!");
                    } else if (n % 2 == 0) {
                        somap += n;
                    } else {
                        somai += n;
                    }
                }
            } while (n <= 1000);

            System.out.println("Soma dos Numeros Pares: " + somap);
            System.out.println("Soma dos Numeros Impares: " + somai);

        } catch (Exception e) {
            System.out.println("Entrada Invalida! Comece Novamente!");
        }

    }

}
