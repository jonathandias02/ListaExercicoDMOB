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
public class Lista01Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        double pi = 3.14f, raio, altura, volume;
        try{
            System.out.println("---CALCULANDO VOLUME DE UMA LATA DE ÓLEO---");
            System.out.println("Digite o Raio da Lata em cm: ");
            raio = sc.nextFloat();
            System.out.println("Digite a Altura da Lata em cm: ");
            altura = sc.nextFloat();
            volume = (pi * Math.pow(raio, 2))* altura;
            System.out.println("RAIO: " + raio + "cm");
            System.out.println("ALTURA: " + altura + "cm");
            System.out.printf("VOLUME: %.2f%s", volume, "cm³\n");
        }catch(InputMismatchException e){
            System.out.println("Não é um numero!");
            System.exit(0);
        }
    }
    
}
