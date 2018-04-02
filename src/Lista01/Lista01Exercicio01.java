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
public class Lista01Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        float n1, n2, soma, diferenca, produto, media;        
        try{
            System.out.println("Digite o Numero 1:");
            n1 = sc.nextFloat();       
            System.out.println("Digite o Numero 2:");
            n2 = sc.nextFloat();
            soma = n1 + n2;
            diferenca = n1 - n2;
            produto = n1 * n2;
            media = soma/2;        
            System.out.println("Soma: " + soma);
            System.out.println("Diferença: " + diferenca);
            System.out.println("Produto: " + produto);
            System.out.println("Media: " + media);
        }catch (InputMismatchException e){
            System.out.println("Não é um número!");
            System.exit(0);
        }
        
    }
    
}
