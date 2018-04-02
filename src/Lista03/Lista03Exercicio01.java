/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Lista03Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner sc = new Scanner(System.in);
        float numeros[] = new float[15], maior, menor;
        
        for(int i = 0;i<numeros.length;i++){
            System.out.println("Digite o numero " + (i+1) + ":");
            numeros[i] = sc.nextInt();
        }
        
        maior = numeros[0];
        menor = numeros[0];
        
        for(int i = 0;i<numeros.length;i++){
            if(numeros[i] > maior) maior = numeros[i];
            if(numeros[i] < menor) menor = numeros[i];
        }
        System.out.println("\n------------TODOS-OS-NUMEROS----------------\n");
        System.out.println(Arrays.toString(numeros));
        System.out.println("\n--------------MAIOR-E-MENOR-----------------\n");
        System.out.println("O Maior é: " + maior);
        System.out.println("\nO Menor é: " + menor);
        
        }catch(Exception e){
            System.out.println("Entrada Invalida!");
        }
    }
    
}
