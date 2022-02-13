/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio4;

/**
 *
 * @author artur
 */
public class produto {
    
    private int serial;
    private int volume;
    private String tester = "não testado";

    public produto(int serial) {
        this.serial = serial;
    }
    
    public boolean testaUnidade(int serial){
        double valor = Math.random();
        if (valor <= 0.9){
            this.tester = "aprovado";
            return true;
        }else{
            this.tester = "reprovado";
            return false;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    

    public int getVolume() {
        return volume;
    }
    
    @Override
    public String toString(){
        return " "+this.serial+" "+getVolume()+" "+testaUnidade(this.serial);
    }
}
