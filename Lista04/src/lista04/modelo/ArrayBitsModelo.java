/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.modelo;


/**
 *
 * @author artur
 */
public class ArrayBitsModelo implements ArrayBitsInterface{
        
    final private int[] bitsArr;

    public ArrayBitsModelo(int tam) {
        this.bitsArr = new int[tam];
    }
    

    public void inserir(int pos, int newValue) {
        this.bitsArr[pos] = newValue; 
    }

    @Override
    public int[] getArray() {
        return this.bitsArr;
    }

    @Override
    public String toString() {
        return "ArrayBits{" + "bitsArr=" + bitsArr + '}';
    }

    @Override
    public int tamanho() {
        return bitsArr.length;
    }


    public int acessarBit(int pos) {
        return bitsArr[pos];
    }
}
