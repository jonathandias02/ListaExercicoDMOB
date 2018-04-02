/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista03Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            int n, pa = 0, im = 0;
            System.out.println("----PARES-E-IMPARES----");
            System.out.println("Entre com numero inteiro: ");
            n = sc.nextInt();
            int pares[], impares[];
            pares = new int[n];
            impares = new int[n];
            System.out.println("--------PARES----------");

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    pares[pa++] = i;
                } else {
                    impares[im++] = i;
                }
            }
            pares = Arrays.copyOf(pares, pa);
            impares = Arrays.copyOf(impares, im);
            System.out.println(Arrays.toString(pares));
            System.out.println("--------IMPARES---------");
            System.out.println(Arrays.toString(impares));
        } catch (Exception e) {
            System.out.println("Entrada Invalida!");
        }
    }

}
