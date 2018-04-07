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
public class Lista02Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        float notas[] = new float[3], media;
        
        try{
            System.out.println("---MEDIA DE NOTAS---");
            System.out.println("1º Nota: ");
            notas[0] = sc.nextFloat();
            System.out.println("2º Nota: ");
            notas[1] = sc.nextFloat();
            System.out.println("2º Nota: ");
            notas[2] = sc.nextFloat();
            
            media = (notas[0]+notas[1]+notas[2])/3;
            
            Arrays.sort(notas);
            
            System.out.println("A maior nota é:" + notas[2]);
            System.out.printf("A media é: %.2f\n", media);
            
        }catch(InputMismatchException e){
            System.out.println("Valor Invalido!");
            System.exit(0);
        }
        
    }
    
}
