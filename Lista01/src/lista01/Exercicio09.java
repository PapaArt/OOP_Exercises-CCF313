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
public class Exercicio09 {
    public static int sum(int a, int b){
        return a + b;
        
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int times(int a, int b){
        return a*b;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
        
        System.out.println("Digite a operacao: ");
        String op = entrada.nextLine();
        op = op.toLowerCase();
        
        String[] currency = op.split(" ");
        
        int result = 0;
        int first = Integer.parseInt(currency[1]);
        int second = Integer.parseInt(currency[3]);
        
        switch (currency[0]){
            case "soma":
                result = sum(first,second);
                break;
            case "subtrai":
                result = sub(first, second);
                break;
            case "divide":
                result = div(first, second);
                break;
            case "multiplica":
                result = times(first, second);
                break;
        }
        
        System.out.println("RESPOSTA: "+result);
        entrada.close();
    }
}
