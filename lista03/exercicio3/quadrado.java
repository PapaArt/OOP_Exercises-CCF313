/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio3;

/**
 *
 * @author artur
 */
public class quadrado extends retangulo{

    public quadrado(float lado, float altura) {
        super(lado, altura);
    }
    
    @Override
    public String getTipo() {
        return "quadrado";
    }
}
