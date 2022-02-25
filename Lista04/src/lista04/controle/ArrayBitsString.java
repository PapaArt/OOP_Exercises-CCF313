/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.controle;

import java.util.Arrays;
import java.util.Random;
import lista04.persistencia.ArrayBitsDAOString;

/**
 *
 * @author artur
 */
public class ArrayBitsString {
    Random rand = new Random();

    ArrayBitsDAOString bitsArr;

    public ArrayBitsString(int tam) {
        bitsArr = new ArrayBitsDAOString(tam);
    }

    public int tamanho(){
        return bitsArr.tamanho();
    }
    
    public void preencheArr() {
        for (int i = 0; i < bitsArr.tamanho(); i++) {
            bitsArr.inserir(i, String.valueOf(rand.nextInt(2)));
        }
    }
    
    
    public String acessarPosicao(int pos) {
        return bitsArr.acessarBit(pos);
    }

    public void setBitsArr(int pos, String novoValor) {
        bitsArr.inserir(pos, novoValor);
        System.out.println("Valor mudado com sucesso!!!");
    }

    public String[] getBitsArr() {
        return bitsArr.getArray();
    } 
    
    
    @Override
    public String toString() {
        return Arrays.toString(bitsArr.getArray());
    }

    public boolean equals(String[] arr) {
        return Arrays.equals(arr, bitsArr.getArray());
    }

    public String[] AND(String[] arr) {
        String[] res = new String[arr.length];

        for (int i = 0; i < bitsArr.tamanho(); i++) {
            if (bitsArr.acessarBit(i).equals(1) && arr[i].equals(1)) {
                res[i] = "1";
            } else {
                res[i] = "0";
            }
        }
        return res;
    }

    public String[] OR(String[] arr) {
        String[] res = new String[arr.length];

        for (int i = 0; i < bitsArr.tamanho(); i++) {
            if (bitsArr.acessarBit(i).equals(1) || arr[i].equals(1)) {
                res[i] = "1";
            }else{
                res[i] = "0";
            }
        }
        return res;
    }
    
    public String[] NOT(){
        String[] res = new String[bitsArr.tamanho()];
        
        for (int i = 0; i < bitsArr.tamanho(); i++){
            res[i] = bitsArr.acessarBit(i).equals(1) ? "0" : "1";
        }
        
        return res;
    }
}
