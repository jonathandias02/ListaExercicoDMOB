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
public class Lista03Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            int n, pr = 0;
            boolean primo = false;
            System.out.println("----ENCONTRANDO-NUMEROS-PRIMOS----");
            System.out.println("Entre com numero inteiro: ");
            n = sc.nextInt();
            int primos[];
            primos = new int[200];
            System.out.println("-------NUMEROS-PRIMOS-------");

            for (int i = 2; i <= n; i++) {
                if (i == 2) {
                    primos[pr++] = i;
                }
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    } else {
                        primo = true;
                    }
                }
                if (primo == true) {
                    primos[pr++] = i;
                }
            }

            primos = Arrays.copyOf(primos, pr);

            System.out.println(Arrays.toString(primos));
        } catch (Exception e) {
            System.out.println("Entrada Invalida!");
        }
    }

}
