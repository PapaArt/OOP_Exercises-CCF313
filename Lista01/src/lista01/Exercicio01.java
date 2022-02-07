/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista01;

import java.util.Scanner;
/**
 *
 * @author artur
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o ano atual: ");
        int anoAtual = s.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = s.nextInt();
        int idade = anoAtual - anoNascimento;
        if (anoNascimento > anoAtual)
            System.out.println("Data inválida!!!");
        else
            System.out.println("Idade do usuário é: "+idade+ " anos!!!");    
    }
    
}
