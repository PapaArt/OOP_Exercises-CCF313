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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o dia: ");
        int dia = entrada.nextInt();
        System.out.println("Digite o mes: ");
        int mes = entrada.nextInt();
        
        switch(mes){
            case 1:
                if (dia <= 31){
                    System.out.println("Data valida para o mes de Janeiro!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 2:
                if (dia <= 28){
                    System.out.println("Data valida para o mes de Fevereiro!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 3:
                if (dia <= 31){
                    System.out.println("Data valida para o mes de Marco!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 4:
                if (dia <= 30){
                    System.out.println("Data valida para o mes de Abril!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 5:
                if (dia <= 31){
                    System.out.println("Data valida para o mes de Maio!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 6:
                if (dia <= 30){
                    System.out.println("Data valida para o mes de Junho!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 7:
                if (dia <= 31){
                    System.out.println("Data valida para o mes de Julho!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 8:
                if (dia <= 31){
                    System.out.println("Data valida para o mes de Agosto!!!");
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 9:
                if (dia <= 30){
                    System.out.println("Data valida para o mes de Setembro!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 10:
                if (dia <= 31){
                    System.out.println("Data valida para o mes de Outubro!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 11:
                if (dia <= 30){
                    System.out.println("Data valida para o mes de Novembro!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            case 12:
                if (dia <=31){
                    System.out.println("Data valida para o mes de Dezembro!!!");
                    break;
                }
                else
                    System.out.println("Data invalida!!!");
                    break;
            default:
                System.out.println("Data invalida!!!");
        }
    }
}
