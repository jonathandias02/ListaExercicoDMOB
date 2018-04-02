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
public class Lista02Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int l1, l2 , l3;
        try{
            System.out.println("---FORMANDO UM TRIANGULO---");
            System.out.println("Tamanho do lado 1:");
            l1 = sc.nextInt();
            System.out.println("Tamanho do lado 2:");
            l2 = sc.nextInt();
            System.out.println("Tamanho do lado 3:");
            l3 = sc.nextInt();
            if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1){
                if(l1 == l2 && l1 == l3){
                    System.out.println("Triangulo EQUILÁTERO");
                }else if(l1 != l2 && l1 != l3 && l2 != l3){
                    System.out.println("Triangulo ESCALENO");
                }else{
                    System.out.println("Triangulo ISÓSCELES");
                }
            }else{
                System.out.println("Não é Possivel Formar um Triangulo!");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Valor Invalido!");
            System.exit(0);
        }
        
    }
    
}
