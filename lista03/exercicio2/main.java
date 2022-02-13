/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio2;

/**
 *
 * @author artur
 */
public class main {
    
    public static void main(String[] args) {
        bicicleta bike = new bicicleta(2);
        automovel carro = new automovel(4);
        
        bike.acelerar(25);
        System.out.println("Número de rodas: "+bike.getNumeroRodas());
        System.out.println("Data: "+carro.getData());
        carro.trocarOleo("12/11/2002");
        System.out.println("Data: "+carro.getData());
        carro.acelerar(150);
        
    }
    
}
