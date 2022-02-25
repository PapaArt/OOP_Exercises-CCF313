/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista04;

import java.util.InputMismatchException;
import java.util.Scanner;
import lista04.visao.TelaBits;
import lista04.visao.TelaBitsString;

/**
 *
 * @author artur
 */
public class Lista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 0;
        int opcao;
        Scanner scan = new Scanner(System.in);

        boolean continueLoop = true;

        do {
            try {
                System.out.print("Digite o tamanho do array de bits: ");
                tam = scan.nextInt();
                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Digite um número inteiro!!!");
                scan.nextLine();
            }
        } while (continueLoop);

        continueLoop = true;

        while (true) {
            menu();
            do {
                try {
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            TelaBits tela = new TelaBits(tam);
                            tela.telaMenu();
                            break;
                        case 2:
                            TelaBitsString telaString = new TelaBitsString(tam);
                            telaString.telaMenu();
                            break;
                        default:
                            System.err.println("Opção Inválida");
                    }
                    continueLoop = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Digite um número inteiro!");
                    scan.nextLine();
                }
            } while (continueLoop);
        }
    }

    public static void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("Opção 1 -- Inteiro");
        System.out.println("Opção 2 -- String");
        System.out.println("--------------------------");
    }
}
