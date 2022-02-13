/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio3;

/**
 *
 * @author artur
 */
public class retangulo extends forma {

    private float lado;
    private float altura;

    public retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = (lado * 2) + (altura * 2);
        return perimetro;
    }

    @Override
    public String getTipo() {
        return "retângulo";
    }

}
