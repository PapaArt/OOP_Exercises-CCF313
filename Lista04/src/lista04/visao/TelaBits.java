/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.visao;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import lista04.controle.ArrayBits;

/**
 *
 * @author artur
 */
public class TelaBits {

    final private ArrayBits bits;

    final Scanner scan;

    public TelaBits(int tam) {
        scan = new Scanner(System.in);
        this.bits = new ArrayBits(tam);
    }

    public void telaMenu() {
        
        telaInicializa();
        menu();
        
        boolean loop = true;
        
        int opcao = 0;
        do {
            try {
                opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        telaAcessa();
                        break;
                    case 2:
                        telaInsere();
                        break;
                    case 3:
                        telaConteudo();
                        break;
                    case 4:
                        telaIgual();
                        break;
                    case 5:
                        telaAND();
                        break;
                    case 6:
                        telaOR();
                        break;
                    case 7:
                        telaNOT();
                        break;
                    case 8:
                        System.exit(0);
                    default:
                        System.err.println("Opção inválida!!!");
                }
                loop = false;
            } catch (InputMismatchException inputMismatch) {
                System.err.println("Digite um número inteiro!!!");
                scan.nextLine();
            }

        } while (loop);
    }

    public void telaInicializa() {
        bits.preencheArr();
        System.out.println("Vetor inicializado com sucesso!!!");
    }

    public void telaAcessa() {
        
        boolean loop = true;
        
        do{
            try{
                System.out.println("Digite a posição a ser acessada: ");
                int pos = scan.nextInt();

                if (pos < 0 || pos > bits.tamanho()){
                    System.err.println("Posição inválida!!!");
                }else{
                    System.out.println("Bit na posição "+pos+ " é: "+bits.acessarPosicao(pos));
                }
                loop = false;
            }catch(InputMismatchException inputMismatch){
                System.err.println("Digite um número inteiro!!!");
                scan.nextLine();
            }
        }while(loop);
    }
    
    public void telaInsere(){
        
        boolean loop = true;
        
        do{
            try{
                System.out.print("Digite a posição: ");
                int pos = scan.nextInt();
                System.out.println("Digite o valor a ser inserido: ");
                int valor = scan.nextInt();

                try{
                    if (valor < 0 || valor > 1){
                        System.out.println("Digite apenas 0 ou 1!!!");
                    }else{
                        bits.setBitsArr(pos, valor);
                    }
                }catch(ArrayIndexOutOfBoundsException boundsException){
                    System.out.println("Digite uma posição válida!!!");
                }
                loop = false;
            }catch(InputMismatchException inputMismatch){
                System.out.println("Digite um número inteiro!!!");
            }
        }while(loop);
    }
    
    public void telaConteudo(){
        System.out.println("Conteúdo do vetor -> "+bits.toString());
    }

    public void telaIgual(){
        int[] arr = new int[bits.tamanho()];
        int valor;
        boolean loop = true;
        
        for (int i = 0; i < bits.tamanho(); i++){
            do{    
                try{
                    System.out.println("Valor para a posição "+ i + ": ");
                    valor = scan.nextInt();
                    if (valor < 0 || valor > 1){
                        System.out.println("Digite apenas 0 ou 1!!!");
                    }else{
                        arr[i] = valor;
                    }
                    loop = false;
                }catch(InputMismatchException inputMismatch){
                    System.out.println("Digite um número inteiro!!!");
                    scan.nextLine();
                }
            }while(loop);
        }
        
        System.out.println("Array base -> "+Arrays.toString(bits.getBitsArr()));
        System.out.println("Array de entrada -> "+Arrays.toString(arr));
        
        if (bits.equals(arr)){
            System.out.println("Os vetores são iguais!");
        }else{
            System.out.println("Os vetores são diferentes!");
        }
    }
    
    public void telaAND(){
        int[] arr = new int[bits.tamanho()];
        int[] res = new int[bits.tamanho()];
        int valor;
        
        boolean loop = true;
        
        for (int i = 0; i < bits.tamanho(); i++){
            do{    
                try{
                    System.out.println("Valor para a posição "+ i + ": ");
                    valor = scan.nextInt();
                    if (valor < 0 || valor > 1){
                        System.out.println("Digite apenas 0 ou 1!!!");
                    }else{
                        arr[i] = valor;
                    }
                    loop = false;
                }catch(InputMismatchException inputMismatch){
                    System.out.println("Digite um número inteiro!!!");
                    scan.nextLine();
                }
            }while(loop);
        }
        
        res = bits.AND(arr);
        
        System.out.println("\nRESULTADO OPERAÇÃO AND\n");
        System.out.println("\nArray de bits :  " + Arrays.toString(bits.getBitsArr()));
        System.out.println("\nArray informado: " + Arrays.toString(arr));
        System.out.println("\nArray Resultado: " + Arrays.toString(res));
        
    }
    
    public void telaOR(){
        int[] arr = new int[bits.tamanho()];
        int[] res = new int[bits.tamanho()];
        int valor;
        
        boolean loop = true;
        
        for (int i = 0; i < bits.tamanho(); i++){
            do{
                try{
                    System.out.println("Valor para a posição "+ i + ": ");
                    valor = scan.nextInt();
                    if (valor < 0 || valor > 1){
                        System.out.println("Digite apenas 0 ou 1!!!");
                    }else{
                        arr[i] = valor;
                    }
                    loop = false;
                }catch(InputMismatchException inputMismatch){
                    System.out.println("Digite um número inteiro!!!");
                    scan.nextLine();
                }
            }while(loop);
        }
        
        res = bits.OR(arr);
        
        System.out.println("\nRESULTADO OPERAÇÃO OR\n");
        System.out.println("\nArray de bits :  " + Arrays.toString(bits.getBitsArr()));
        System.out.println("\nArray informado: " + Arrays.toString(arr));
        System.out.println("\nArray Resultado: " + Arrays.toString(res));
    }
    
    public void telaNOT(){
        
        int[] res = new int[bits.tamanho()];
        
        res = bits.NOT();
        
        System.out.println("\nRESULTADO OPERAÇÃO NOT\n");
        System.out.println("\nArray de bits :  " + Arrays.toString(bits.getBitsArr()));
        System.out.println("\nArray Resultado: " + Arrays.toString(res));
    }
    
    public void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("Opção 1 -- Acessar posição");
        System.out.println("Opção 2 -- Inserir novo valor");
        System.out.println("Opção 3 -- Retornar conteúdo do vetor");
        System.out.println("Opção 4 -- Verificar se o vetor é igual");
        System.out.println("Opção 5 -- Operação lógica AND");
        System.out.println("Opção 6 -- Operação lógica OR");
        System.out.println("Opção 7 -- Operação lógica NOT");
        System.out.println("Opção 8 -- Sair");
        System.out.println("--------------------------");
    }

}
