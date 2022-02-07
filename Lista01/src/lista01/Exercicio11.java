/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        File file = new File("/home/artur/Documents/POO/atividade_pratica/Lista01/src/lista01/pacientes.txt");
        
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        int qtd_pacientes = 0;
        int num_mulheres = 0;
        int idade_entre = 0;
        int maior_idade = 0;
        
        double media = 0;
        double altura_mulheres = 0;
        double peso = 0;
        double qtd_homens = 0;
        double idade_homens = 0;
        
        String mais_velho = "";
        String mais_baixa = "";
        
        try (Scanner myReader = new Scanner(file)){
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] line = data.split(" ");
                
                if (line[1].equals("M")){
                    qtd_homens++;
                    idade_homens += Integer.parseInt(line[3]);
                }
                
                if ((Double.parseDouble(line[2]) > 70) && (Double.parseDouble(line[4]) >= 1.6 && Double.parseDouble(line[4]) <= 1.7)){
                    num_mulheres++;
                }
                
                if (Integer.parseInt(line[3])>= 18 && Integer.parseInt(line[3]) <= 25){
                    idade_entre++;
                }
                
                if (line[1].equals("F") && altura_mulheres == 0){
                    mais_baixa = line[0];
                    altura_mulheres = Double.parseDouble(line[4]);
                }else if (line[1].equals("F") && Double.parseDouble(line[4]) < altura_mulheres){
                    mais_baixa = line[0];
                    altura_mulheres = Double.parseDouble(line[4]);
                }
                
                if (line[1].equals("M") && maior_idade == 0){
                    mais_velho = line[0];
                    maior_idade = Integer.parseInt(line[3]);
                }else if (line[1].equals("M") && Integer.parseInt(line[3]) > maior_idade){
                    mais_velho = line[0];
                    maior_idade = Integer.parseInt(line[3]);
                }
                
                qtd_pacientes++;
            }
        }catch (Exception e){
            System.err.println("Erro ao ler o arquivo!!!");
        }
        
        media = idade_homens/qtd_homens;
        
        System.out.println("Quantidade de pacientes: "+qtd_pacientes);
        System.out.println("Media de idade dos homens: "+formatador.format(media));
        System.out.println("Numero de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "+num_mulheres);
        System.out.println("A quantidade de pessoas com idade entre 18 e 25: "+idade_entre);
        System.out.println("Nome do paciente mais velho: "+mais_velho);
        System.out.println("Nome da mulher mais baixa: "+mais_baixa);
    }
}