/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista02;

/**
 *
 * @author artur
 */
public class Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario trabalhador1 = new Funcionario();
        Funcionario trabalhador2 = new Funcionario();
        Funcionario trabalhador3 = new Funcionario();
        
        
        trabalhador1.Funcionario("Artur Papa", "23/11/2000");
        trabalhador1.contratar(0, 1, "25/02/2018", 8, 2500);
        trabalhador1.setSalario(2000);
        trabalhador1.setHorasTrabalhadas(4);
        trabalhador1.setTipoContrato(1);
        trabalhador1.folhaPagamento(trabalhador1.getSalario(), trabalhador1.getHorasTrabalhadas(), trabalhador1.getTipoContrato());
        
        trabalhador2.Funcionario("Joaquim da Silva", "31/10/1998");
        trabalhador2.contratar(1, 0, "27/12/2018", 5, 2000);
        trabalhador2.setSalario(4000);
        trabalhador2.setHorasTrabalhadas(8);
        trabalhador2.setTipoContrato(0);
        trabalhador2.folhaPagamento(trabalhador2.getSalario(), trabalhador2.getHorasTrabalhadas(), trabalhador2.getTipoContrato());
        
        trabalhador3.Funcionario("Fernanda Teixeira", "05/10/1998");
        trabalhador3.contratar(0, 4, "27/03/2019", 10, 3000);
        trabalhador3.setSalario(3500);
        trabalhador3.setHorasTrabalhadas(6);
        trabalhador3.setFilhosIdade(2);
        trabalhador3.folhaPagamento(trabalhador3.getSalario(), trabalhador3.getHorasTrabalhadas(), trabalhador3.getTipoContrato());
    }
}
