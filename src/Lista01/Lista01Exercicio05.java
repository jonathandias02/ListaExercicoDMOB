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
public class Lista01Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n;
        try{
            System.out.println("--QUADRADO DE UM NÚMERO INTEIRO---");
            System.out.println("Digite um número");
            n = sc.nextInt();
            System.out.println(n + "² = " + (int)Math.pow(n, 2));
        }catch(InputMismatchException e){
            System.out.println("Valor digitado é incorreto!");
            System.exit(0);
        }
        
    }
    
}
