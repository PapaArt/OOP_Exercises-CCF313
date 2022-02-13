/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio5;

/**
 *
 * @author artur
 */
public class papel implements objeto{
    protected String nome;
    public papel(){
        nome="papel";
    }
    @Override
    public String nomeObjeto() {
        return nome;
    }

    
    @Override
    public boolean vitoria(objeto adversario) {
        if(adversario.nomeObjeto() == "pedra"){
            return true;
        }
        else{
            return false;
        }
    }
}
