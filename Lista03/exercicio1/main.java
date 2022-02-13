/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista03.exercicio1;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class main {
    
    public static void main(String[] args) {
        calculadoraCientifica calc = new calculadoraCientifica();
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a operacao: ");
        String op = entrada.nextLine();
        op = op.toLowerCase();
        int first = 0, second = 0;

        double result = 0;
        if (!op.equals("raiz")){
            first = entrada.nextInt();
            second = entrada.nextInt();
        }else{
            first = entrada.nextInt();
        }
        

        switch (op) {
            case "soma":
                result = calc.sum(first, second);
                break;
            case "subtrai":
                result = calc.sub(first, second);
                break;
            case "divide":
                result = calc.div(first, second);
                break;
            case "multiplica":
                result = calc.times(first, second);
                break;
            case "raiz":
                result = calc.raiz(first);
                break;
            case "potencia":
                result = calc.potencia(first, second);
                break;
        }

        System.out.println("RESPOSTA: " + result);
        entrada.close();
    }
    
}
