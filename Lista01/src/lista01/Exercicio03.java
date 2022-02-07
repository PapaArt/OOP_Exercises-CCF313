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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o salario do funcionario: ");
        float salario = s.nextFloat();
        System.out.println("Digite o emprestimo requerido: ");
        float emprestimo = s.nextFloat();
        double permitido = salario*0.3;
        
        if (emprestimo > permitido)
            System.out.println("Emprestimo nao concedido!!!");
        else
            System.out.println("Emprestimo concedido!!!");
    }
}
