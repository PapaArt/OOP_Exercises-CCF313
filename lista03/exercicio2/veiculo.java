/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio2;

/**
 *
 * @author artur
 */
public class veiculo {

    private int numeroRodas;
    private float velocidade;

    public veiculo(int numeroRodas) {
        velocidade = 0;
        this.numeroRodas = numeroRodas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void acelerar(float aceleracao) {
        this.velocidade += aceleracao;
        System.out.println("Velocidade atual é: " + getVelocidade());
    }

    public void parar() {
        velocidade = 0;
        System.out.println("Velocidade atual é: " + getVelocidade());
    }
}
