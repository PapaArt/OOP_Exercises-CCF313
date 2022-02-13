/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio2;

/**
 *
 * @author artur
 */
public class automovel extends veiculo{
    
    String data;

    public automovel(int numeroRodas){
        super(numeroRodas);
        data = "00/00/00";
    }
    
    public String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }
    
    public void trocarOleo(String data){
        setData(data);
        System.out.println("Nova data de troca: "+data);
    }
}
