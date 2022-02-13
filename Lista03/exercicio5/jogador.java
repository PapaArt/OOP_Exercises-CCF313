/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public final class jogador {

    public static void main(String[] args) {
        Random rand = new Random();
        jogador player = new jogador(rand.nextInt(30) + 4);
    }
    objeto[] obj;
    objeto paper, rock, scissor;
    
    public jogador(int num){
        obj = new objeto[]{paper= new papel(),rock = new pedra(),scissor = new tesoura()};
        for(int i = 0; i < num; i++){
            Random rand = new Random();
            this.play(obj[rand.nextInt(3)], obj[rand.nextInt(3)]);
            
        }
    }
    public void play(objeto obj1, objeto obj2){
        if(obj1.vitoria(obj2)){
            System.out.println(obj1.nomeObjeto() +" ganhou "+  obj2.nomeObjeto());
        }else if(obj2.vitoria(obj1)){
            System.out.println(obj2.nomeObjeto() +" ganhou "+ obj1.nomeObjeto());
        }else{
            System.out.println(obj2.nomeObjeto() + " empate com " + obj1.nomeObjeto());
        }
    }

}
