/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio5;

/**
 *
 * @author artur
 */
public class pedra implements objeto{
    protected String nome;
    public pedra(){
        nome="pedra";
    }
    @Override
    public String nomeObjeto() {
        return nome;
    }

    @Override
    public boolean vitoria(objeto adversario) {
        if(adversario.nomeObjeto() == "tesoura"){
            return true;
        }
        else{
            return false;
        }
    }
}
