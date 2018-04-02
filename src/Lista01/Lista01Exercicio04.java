/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista01Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        try{
            System.out.println("---INVERTENDO VALORES DE A E B---");
            System.out.println("Digite o Valor de A:");
            a = sc.nextFloat();
            System.out.println("Digite o Valor de B:");
            b = sc.nextFloat();
            c = a;
            a = b;
            b = c;
            System.out.println("A = " + a);
            System.out.println("B = " + b);
        }catch(InputMismatchException e){
            System.out.println("Não é um numero!");
            System.exit(0);
        }
        
    }
    
}
