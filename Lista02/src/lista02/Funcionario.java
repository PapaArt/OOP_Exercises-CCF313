/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista02;

import java.text.DecimalFormat;

/**
 *
 * @author artur
 */
public class Funcionario {
    private String nome = new String();
    
    DecimalFormat formatador = new DecimalFormat("0.00");
    
    private String dataNascimento;
    // 0 para Efetivo, 1 para Horista;
    public int tipoContrato;
    public int filhosMenorIdade;
    public String dataAdmissao;
    
    public float horasTrabalhadas;
    
    public double salario; 
    
    private double PATAMAR_1 = 1659.38;
    private double PATAMAR_2 = 2765.66;
    private double PATAMAR_3 = 5531.31;
    
    private double PATAMAR_IR_1 = 1903.99;
    private double PATAMAR_IR_2 = 2826.65;
    private double PATAMAR_IR_3 = 3751.05;
    private double PATAMAR_IR_4 = 4664.68;
    
    private double ALIQUOTA_IR_1 = 0.075;
    private double ALIQUOTA_IR_2 = 0.15;
    private double ALIQUOTA_IR_3 = 0.225;
    private double ALIQUOTA_IR_4 = 0.275;
    
    private double PARCELA_IR_1 = 142.8;
    private double PARCELA_IR_2 = 354.8;
    private double PARCELA_IR_3 = 636.13;
    private double PARCELA_IR_4 = 869.36;
    
    private double ALIQUOTA_1 = 0.08;
    private double ALIQUOTA_2 = 0.09;
    private double ALIQUOTA_3 = 0.11;
    
    
    
    public void Funcionario(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public void contratar(int tipoContrato, int filhosMenorIdade, String dataAdmissao, float horasTrabalhadas, double salario){
        this.tipoContrato = tipoContrato;
        this.filhosMenorIdade = filhosMenorIdade;
        this.dataAdmissao = dataAdmissao;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = salario;
    }
    
    public void setTipoContrato(int tipoContrato){
        this.tipoContrato = tipoContrato;
    }
    
    public void setFilhosIdade(int filhosMenorIdade){
        this.filhosMenorIdade = filhosMenorIdade;
    }
    
    public void setDataAdmissao(String dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    
    public void setHorasTrabalhadas(float horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public int getTipoContrato(){return tipoContrato;}
    public int getFilhosIdade(){return filhosMenorIdade;}
    public String getDataAdmissao(){return dataAdmissao;}
    public float getHorasTrabalhadas(){return horasTrabalhadas;}
    public double getSalario(){return salario;}
    
    public double calculoSalario(float horasTrabalahadas, int tipoContrato){
        double salarioBruto = 0;
        
        switch (tipoContrato) {
            case 0:
                salarioBruto = salario;
                break;
            case 1:
                salarioBruto = salario*horasTrabalhadas;
                break;
            default:
                System.out.println("Valor invalido!!!");
                break;
        }
        return salarioBruto;
    }
    
    public double descontoInss(double salario){
        double desconto;
        
        if (salario <= PATAMAR_1){
            desconto = salario*ALIQUOTA_1;
        }else if (salario > PATAMAR_1 && salario <= PATAMAR_2){
            desconto = salario*ALIQUOTA_2;
        }else if (salario > PATAMAR_2 && salario <= PATAMAR_3){
            desconto = salario*ALIQUOTA_3;
        }else{
            desconto = PATAMAR_3*ALIQUOTA_3;
        }
        
        return desconto;
    }
    
    public double IR(double salario){
        double descontoIR;
        if (salario < PATAMAR_IR_1){
            descontoIR = 0;
        }else if (salario >= PATAMAR_IR_1 && salario <= PATAMAR_IR_2){
            descontoIR = (salario*ALIQUOTA_IR_1) - PARCELA_IR_1;
        }else if (salario > PATAMAR_IR_2 && salario <= PATAMAR_IR_3){
            descontoIR = (salario*ALIQUOTA_IR_2) - PARCELA_IR_2; 
        }else if (salario > PATAMAR_IR_3 && salario <= PATAMAR_IR_4){
            descontoIR = (salario*ALIQUOTA_IR_3) - PARCELA_IR_3;
        }else{
            descontoIR = (salario*ALIQUOTA_IR_4) - PARCELA_IR_4;
        }
        
        return descontoIR;
    }
    
    public double salarioLiquido(double salario, float horasTrabalhadas, int tipoContrato){
        double salarioLiquido = calculoSalario(horasTrabalhadas, tipoContrato) - (descontoInss(salario) + IR(salario));
        
        return salarioLiquido;
    }
    
    
    public void folhaPagamento(double salario, float horasTrabalhadas, int tipoContrato){
        System.out.println("Nome do funcionario: "+nome);
        System.out.println("Data de nascimento: "+dataNascimento);
        System.out.println("Salario bruto: "+formatador.format(calculoSalario(horasTrabalhadas, tipoContrato)));
        System.out.println("INSS: "+formatador.format(descontoInss(salario)));
        System.out.println("Imposto de Renda: "+formatador.format(IR(salario)));
        System.out.println("Salario liquido: "+formatador.format(salarioLiquido(salario, horasTrabalhadas, tipoContrato)));
        System.out.println();
    }
}
