/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio3;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class main {
    
    public static void main(String[] args) {
        ArrayList<forma> tipos = new ArrayList();
        retangulo ret = new retangulo(2, 5);
        quadrado quad = new quadrado(2, 2);
        circulo circle = new circulo((float) 2.5);
        
        retangulo ret2 = new retangulo(5, 10);
        quadrado quad2 = new quadrado(4, 8);
        circulo circle2 = new circulo((float) 9.5);
        
        retangulo ret3 = new retangulo(10, 8);
        quadrado quad3 = new quadrado(9, 5);
        circulo circle3 = new circulo((float) 37.9);
        
        tipos.add(ret);
        tipos.add(ret2);
        tipos.add(ret3);
        
        tipos.add(quad);
        tipos.add(quad2);
        tipos.add(quad3);
        
        tipos.add(circle);
        tipos.add(circle2);
        tipos.add(circle3);
        
        for(forma shape: tipos){
            System.out.println("Forma do tipo: "+shape.getTipo());
            System.out.println("Área: "+shape.calcularArea());
            System.out.println("Perímetro: "+shape.calcularPerimetro());
            System.out.println("");
        }
    }
    
}
