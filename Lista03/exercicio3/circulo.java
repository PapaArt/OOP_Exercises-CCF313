/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio3;

/**
 *
 * @author artur
 */
public class circulo extends forma {

    private float raio;

    public circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        float area = (float) (Math.PI * Math.pow(raio, 2));
        return area;
    }

    @Override
    public float calcularPerimetro() {
        float circunferencia = (float) (2 * Math.PI * raio);
        return circunferencia;
    }

    @Override
    public String getTipo() {
        return "círculo";
    }
}
