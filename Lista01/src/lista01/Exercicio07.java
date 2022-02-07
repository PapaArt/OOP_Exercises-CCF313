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
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N = entrada.nextInt();
        
        int[] arr = new int[N];
        int menor_valor;
        int media = 0;
        int maior_valor;
        int qtd_par = 0;
        int qtd_impar = 0;
        
        arr[0] = entrada.nextInt();
        menor_valor = arr[0];
        maior_valor = arr[0];   
        
        for (int i = 1; i < N; i++){
            arr[i] = entrada.nextInt();
            
            
            if (arr[i] < menor_valor){
                menor_valor = arr[i];
            }
            
            if (arr[i] > maior_valor){
                maior_valor = arr[i];
            }
            
            if (arr[i]%2 == 0){
                qtd_par++;
            }else
                qtd_impar++;
            
            media += arr[i];
        }
        
        if (arr[0]%2 == 0){
                qtd_par++;
            }else
                qtd_impar++;
        
        media = media/N;
        
        System.out.println("Menor valor: "+menor_valor+"\nMedia: "+media+"\nMaior valor: "+maior_valor+"\nQuantidade de numeros pares: "+qtd_par+"\nQuantidade de numeros impares: "+qtd_impar);
    }
}
