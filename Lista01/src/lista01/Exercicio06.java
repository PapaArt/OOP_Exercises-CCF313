/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author artur
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] hora = new int[2];
        int[] minuto = new int[2];
        int[] segundos = new int[2];
        int[] conversor = new int[4];
        
        hora[0] = entrada.nextInt();
        hora[1] = entrada.nextInt();
        
        minuto[0] = entrada.nextInt();
        minuto[1] = entrada.nextInt();
        
        segundos[0] = entrada.nextInt();
        segundos[1] = entrada.nextInt();
        
        conversor[0] = hora[0] * 360;
        conversor[1] = minuto[0] * 60;
        conversor[2] = hora[1] * 360;
        conversor[3] = minuto[1] * 60;
        
        int diferenca = Math.abs((conversor[0] + conversor[1] + segundos[0]) - (conversor[2] + conversor[3] - segundos[1]));
        
        System.out.println("Diferenca em segundos: "+diferenca);
    }
}
