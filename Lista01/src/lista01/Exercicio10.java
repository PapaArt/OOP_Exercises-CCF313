/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author artur
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        
        int rand_int = rand.nextInt(100) + 1;
        int tentativas = 0;
        boolean acerto = false;
        
        while (acerto != true){
            int palpite = entrada.nextInt();
            if (palpite > rand_int){
                System.out.println("Tente um numero menor!!!");
                tentativas++;
            }else if (palpite < rand_int){
                System.out.println("Tente um numero maior!!!");
                tentativas++;
            }else{
                System.out.println("Parabens, voce adivinhou o valor gerado: "+rand_int);
                tentativas++;
                acerto = true;
            }
        }
        System.out.println("Tentativas: "+tentativas);
        entrada.close();
    }
}
