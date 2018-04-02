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
public class Lista01Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float gc, gf;
        try{
        System.out.println("---GRAUS CELSIUS PARA  FAHRENHEIT---");
        System.out.println("Digite a temperatura em ºC");
        gc = sc.nextFloat();
        gf = (9*gc + 160)/5;
        System.out.println(gc + "ºC em Fahrenheit é: " + gf + "ºF");
        }catch(InputMismatchException e){
            System.out.println("Não é um numero!");
            System.exit(0);
        }
    }
    
}
