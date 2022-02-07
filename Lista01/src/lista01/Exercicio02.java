/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;
/**
 *
 * @author artur
 */
public class Exercicio02 {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            
            System.out.println("Digite o numerador:");
            float numerador = s.nextFloat();
            System.out.println("Digite o denominador: ");
            float denominador = s.nextFloat();
            float num_real = numerador/denominador;
            if (denominador == 0)
                System.out.println("Impossivel de fazer o calculo!!!");
            else
                System.out.println("Numero real: "+num_real);
        }
        
}
