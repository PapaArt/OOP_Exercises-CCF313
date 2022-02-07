/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author artur
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String value = "";
        
        List<Integer> arr = new ArrayList<>();
        
        do{
            System.out.println("Digite um valor: ");
            value = entrada.next();
            
            if (value.equals("fim")){
                break;
            }else{
                arr.add(Integer.parseInt(value));
            }
        
        }while ((!value.equals("fim")));
        
        int[] arr_order = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++){
            arr_order[i] = arr.get(i);
        }
        
        for (int i = 0; i < arr_order.length; i++){
            for (int j = i + 1; j < arr_order.length; j++){
                int aux = 0;
                
                if (arr_order[i] > arr_order[j]){
                    aux = arr_order[i];
                    arr_order[i] = arr_order[j];
                    arr_order[j] = aux;
                }
            }
        }
        
        System.out.println("Vetor ordenado: "+Arrays.toString(arr_order));
        entrada.close();
    }
}
