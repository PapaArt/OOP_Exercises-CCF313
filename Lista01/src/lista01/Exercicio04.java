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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        
        System.out.println("Digite o mes: ");
        String nome_mes = s.next();
        switch(nome_mes){
            case "Janeiro":
                System.out.println(nome_mes+" = 1");
                break;
            case "Fevereiro":
                System.out.println(nome_mes+" = 2");
                break;
            case "Marco":
                System.out.println(nome_mes+" = 3");
                break;
            case "Abril":
                System.out.println(nome_mes+" = 4");
                break;
            case "Maio":
                System.out.println(nome_mes+" = 5");
                break;
            case "Junho":
                System.out.println(nome_mes+" = 6");
                break;
            case "Julho":
                System.out.println(nome_mes+" = 7");
                break;
            case "Agosto":
                System.out.println(nome_mes+" = 8");
                break;
            case "Setembro":
                System.out.println(nome_mes+" = 9");
                break;
            case "Outubro":
                System.out.println(nome_mes+" = 10");
                break;
            case "Novembro":
                System.out.println(nome_mes+" = 11");
                break;
            case "Dezembro":
                System.out.println(nome_mes+" = 12");
                break;
            default:
                System.out.println("Mes invalido!!!");
                break;
        }
        
    }
}
