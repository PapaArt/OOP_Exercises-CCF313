/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio4;

/**
 *
 * @author artur
 */
public class main {
    
    public static void main(String[] args) {
        produto product1 = new produto(54);
        produto product2 = new produto(15);
        produto product3 = new produto(27);
        produto product4 = new produto(33);
        produto product5 = new produto(84);
        
        product1.setVolume(5);
        product2.setVolume(18);
        product3.setVolume(1354987);
        product4.setVolume(54);
        product5.setVolume(69);
        
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        System.out.println(product5.toString());
    }
}
