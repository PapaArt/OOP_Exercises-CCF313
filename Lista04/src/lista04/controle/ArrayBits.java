/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.controle;

import java.util.Arrays;
import java.util.Random;
import lista04.persistencia.ArrayBitsDAO;

/**
 *
 * @author artur
 */
public class ArrayBits {

    Random rand = new Random();

    ArrayBitsDAO bitsArr;

    public ArrayBits(int tam) {
        bitsArr = new ArrayBitsDAO(tam);
    }

    public int tamanho(){
        return bitsArr.tamanho();
    }
    
    public void preencheArr() {
        for (int i = 0; i < bitsArr.tamanho(); i++) {
            bitsArr.inserir(i, rand.nextInt(2));
        }
    }
    
    
    public int acessarPosicao(int pos) {
        return bitsArr.acessarBit(pos);
    }

    public void setBitsArr(int pos, int novoValor) {
        bitsArr.inserir(pos, novoValor);
        System.out.println("Valor mudado com sucesso!!!");
    }

    public int[] getBitsArr() {
        return bitsArr.getArray();
    } 
    
    
    @Override
    public String toString() {
        return Arrays.toString(bitsArr.getArray());
    }

    public boolean equals(int[] arr) {
        return Arrays.equals(arr, bitsArr.getArray());
    }

    public int[] AND(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < bitsArr.tamanho(); i++) {
            if (bitsArr.acessarBit(i) == 1 && arr[i] == 1) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

    public int[] OR(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < bitsArr.tamanho(); i++) {
            if (bitsArr.acessarBit(i) == 1 || arr[i] == 1) {
                res[i] = 1;
            }else{
                res[i] = 0;
            }
        }
        return res;
    }
    
    public int[] NOT(){
        int[] res = new int[bitsArr.tamanho()];
        
        for (int i = 0; i < bitsArr.tamanho(); i++){
            res[i] = bitsArr.acessarBit(i) == 1 ? 0 : 1;
        }
        
        return res;
    }
}
