/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04.persistencia;

import lista04.modelo.BitsModeloString;

/**
 *
 * @author artur
 */
public class ArrayBitsDAOString {
    final private BitsModeloString bits;

    public ArrayBitsDAOString(int tam) {
        bits = new BitsModeloString(tam);
    }
    
    public void inserir(int pos, String valor){
        bits.inserir(pos, valor);
    }
    
    public String[] getArray(){
        return bits.getArray();
    }
    
    public String acessarBit(int pos){
        return bits.acessarBit(pos);
    }
    
    public String listarBits(){
        return bits.toString();
    }
    
    public int tamanho(){
        return bits.tamanho();
    }
}
