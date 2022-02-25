/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.persistencia;

import lista04.modelo.ArrayBitsModelo;

/**
 *
 * @author artur
 */
public class ArrayBitsDAO {
    
    final private ArrayBitsModelo bits;

    public ArrayBitsDAO(int tam) {
        bits = new ArrayBitsModelo(tam);
    }
    
    public void inserir(int pos, int valor){
        bits.inserir(pos, valor);
    }
    
    public int[] getArray(){
        return bits.getArray();
    }
    
    public int acessarBit(int pos){
        return bits.acessarBit(pos);
    }
    
    public String listarBits(){
        return bits.toString();
    }
    
    public int tamanho(){
        return bits.tamanho();
    }
}
