/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio1;

/**
 *
 * @author artur
 */
public class calculadoraCientifica extends calculadora {
        
    public double raiz(double num){
        double resultado = Math.sqrt(num);
        return resultado;
    }
    
    public double potencia(double num1, double num2){
        double resultado = Math.pow(num1, num2);
        return resultado;
    }
}
