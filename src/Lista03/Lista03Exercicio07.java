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
public class Lista03Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            float n;
            int i = 1;
            System.out.println("--ENTRE-COM-AS-MÉDIAS-FINAIS-DOS-ALUNOS-DA-TURMA--");
            System.out.println("--O-PROGRAMA-FINALIZA-COM-UMA-MEDIA-NEGATIVA--\n");
            System.out.println("Media Aluno 1:");
            n = sc.nextFloat();
            char fim = 'c';
            float maior = n, menor = n, media, soma = n;
            if (n >= 0) {
                do {
                    System.out.println("Media Aluno " + (i + 1) + ":");
                    n = sc.nextFloat();
                    i++;
                    if (n < 0) {
                        System.out.println("\nMédia Negativa! RESULTADO:\n"
                                + "-----------------------------------------------");
                        fim = 'f';
                    }
                    if (n > maior) {
                        maior = n;
                    }
                    if (n < menor && n >= 0) {
                        menor = n;
                    }
                    if (n > 0) {
                        soma += n;
                    }

                } while (fim != 'f');

                media = soma / (i - 1);

                System.out.println("Maior Media: " + maior + "\nMenor Media: " + menor
                        + "\nMedia Aritimetica da Turma: " + media + "\n---------"
                        + "--------------------------------------");

            } else {
                System.out.println("Média Negativa! FIM DO PROGRAMA!");
            }

        } catch (Exception e) {
            System.out.println("Entrada Invalida! FIM DO PROGRAMA!");
        }
    }

}
