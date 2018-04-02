/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista02Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        char ordem;
        try{
        System.out.println("---CRESCENTE-OU-DECRESCENTE---");
        System.out.println("Digite o 1 numero: ");
        num[0] = sc.nextInt();
        System.out.println("Digite o 2 numero: ");
        num[1] = sc.nextInt();
        System.out.println("Digite o 3 numero: ");
        num[2] = sc.nextInt();
        
        Arrays.sort(num);
        
        System.out.println("Digite 'c' para crescente e 'd' para decrescente!");
        ordem = sc.next().charAt(0);
        
            switch (ordem) {
                case 'c': case 'C':
                    System.out.println("--ORDEM-CRESCENTE--");
                    System.out.println(Arrays.toString(num));
                    break;
                case 'd': case 'D':
                    System.out.println("--ORDEM-DECRESCENTE--");
                    System.out.print("[");
                    for(int i = num.length; i > 0; --i){
                        System.out.print(num[i-1]);
                        if(i != 1 ) System.out.print(", ");
                    }       System.out.println("]");
                    break;
                default:
                    System.out.println("Valor Invalido!");
                    break;
            }
        
        }catch(InputMismatchException e){
            System.out.println("Valor Invalido!");
        }
        
    }
    
}
