/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista02Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int n[] = new int[3], opcao, soma, media, multiplicacao, v, i;

        try {

            System.out.println("---MINI-CALCULADORA---");
            System.out.println("Entre com nº 1:");
            n[0] = sc.nextInt();
            System.out.println("Entre com nº 2:");
            n[1] = sc.nextInt();
            System.out.println("Entre com nº 3:");
            n[2] = sc.nextInt();

            soma = n[0] + n[1] + n[2];
            media = soma / 3;
            multiplicacao = n[0] * n[1] * n[2];

            do {

                System.out.println("-------OPÇÔES-------");
                System.out.print("1- Calcular Média \n2- Calcular Soma \n"
                        + "3 - Calcular Mutiplicação \n4 - Sair\n");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("A Média é: " + media);
                        do {
                            System.out.println("0 - Para Voltar!");
                            v = sc.nextInt();
                        } while (v != 0);
                        break;
                    case 2:
                        System.out.println("A Soma é: " + soma);
                        do {
                            System.out.println("0 - Para Voltar!");
                            v = sc.nextInt();
                        } while (v != 0);
                        break;
                    case 3:
                        System.out.println("A Multiplicação é: " + multiplicacao);
                        do {
                            System.out.println("0 - Para Voltar!");
                            v = sc.nextInt();
                        } while (v != 0);
                        break;
                    case 4:
                        System.out.println("Até Logo!");
                        break;
                    default:
                        System.out.println("Opção Invalida!");
                        break;
                }

            } while (opcao != 4);

        } catch (Exception e) {
            System.out.println("Entrada Ivalida!");
        }

    }

}
