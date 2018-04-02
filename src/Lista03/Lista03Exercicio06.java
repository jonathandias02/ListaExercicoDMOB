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
public class Lista03Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        float v1, v2, v3, soma, produto, media;
        char fim = 'c';

        System.out.println("----ENTRE COM CONJUNTO DE 3 NUMEROS PARA VERIFICAR: "
                + "SOMA, PRODUTO E MEDIA----");
        System.out.println("##DIGITE OS NUMEROS EM ORDEM CRESCENTE CASO CONTRARIO"
                + " O PROGRAMA ENCERRARÁ!##");

        do {
            System.out.println("Nº 1: ");
            v1 = sc.nextFloat();
            System.out.println("Nº 2: ");
            v2 = sc.nextFloat();
            System.out.println("Nº 3: ");
            v3 = sc.nextFloat();
            if (v1 > v2 || v2 > v3) {
                System.out.println("Não está em ordem crescente!\nFIM DO "
                        + "PROGRAMA!");
                fim = 'f';
            } else {
                soma = v1 + v2 + v3;
                produto = v1 * v2 * v3;
                media = soma / 3;
                System.out.println("--------------------------------------------\n"
                        + "Soma: " + soma + "\nProduto:" + produto + "\n"
                        + "Média: " + media + "\n"
                        + "-------------------------------------------\n");
            }
        } while (fim != 'f');
    }

}
