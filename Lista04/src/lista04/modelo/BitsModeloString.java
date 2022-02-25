/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.modelo;

/**
 *
 * @author artur
 */
public class BitsModeloString implements ArrayBitsInterface{
    final private String[] bitsArr;

    public BitsModeloString(int tam) {
        this.bitsArr = new String[tam];
    }
    

    public void inserir(int pos, String newValue) {
        this.bitsArr[pos] = newValue; 
    }

    @Override
    public String[] getArray() {
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


    public String acessarBit(int pos) {
        return bitsArr[pos];
    }
}
