/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista02Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n;
        try{
            System.out.println("---PAR OU IMPA - POSITIVO OU NEGATIVO---");
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            if(n == 0){
                System.out.println(n + " é Neutro");
            }else if(n%2 == 0){
                System.out.println(n + " é PAR");
            }else{
                System.out.println(n + " é IMPAR");
            }
            if(n<0){
                System.out.println(n + " é NEGATIVO");
            }else if(n == 0){
                System.out.println(n + " Não é POSITIVO nem NEGATIVO");
            }else{
                System.out.println(n + " é POSITIVO");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Valor Invalido!");
            System.exit(0);
        }
        
    }
    
}
