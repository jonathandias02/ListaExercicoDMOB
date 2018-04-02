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
public class Lista03Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            Scanner sc = new Scanner(System.in);
            int n;
            boolean primo = true;
            System.out.println("-------É-UM-NUMERO-PRIMO-OU-NÃO?-------");
            System.out.println("Entre com numero natural: ");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Não é um numero natural!");
                System.exit(0);
            } else {
                switch (n) {
                    case 0:
                    case 1:
                        primo = false;
                        break;

                    case 2:
                        primo = true;
                        break;

                    default:
                        for (int i = 2; i < n; i++) {
                            if (n % i == 0) {
                                primo = false;
                                break;
                            }
                        }
                        break;
                }
            }

            if (primo) {
                System.out.println("É um número primo!");
            } else {
                System.out.println("Não é um número primo!");
            }

        } catch (Exception e) {
            System.out.println("Entrada Invalida! FIM DO PROGRAMA!");
        }

    }

}
