/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio3;

/**
 *
 * @author artur
 */
public abstract class forma {
    
    String tipo;
    
    public abstract float calcularArea();
  
    public abstract float calcularPerimetro();

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
