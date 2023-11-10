package Aula1910;

import java.util.Scanner;

public class Conta{
    int numeroConta;
    String donoConta;
    double saldoConta;
    double limiteConta;

    void sacaDinheiro(double saque){
        this.saldoConta -= saque;
    }
    void depositoDinheiro(double deposito){
        this.saldoConta += deposito;
    }
    public String getDonoConta() {
        return donoConta;
    }
    public double getSaldoConta() {
        return saldoConta;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getLimiteConta() {
        return limiteConta;
    }


    public static void main(String[] args){
        Conta novaConta;
        Scanner sc = new Scanner(System.in);
        novaConta = new Conta();
        double valorManip = 0 ;
        novaConta.donoConta = "Nicolas";
        novaConta.saldoConta = 1095.78;
        novaConta.limiteConta = 4500;

        System.out.println("--------------------------------------------");
        System.out.println("-------Bem vindo ao banco da putaria--------");
        System.out.println(String.format("-------Nome do dono: %s----------",novaConta.getDonoConta()));
        System.out.println(String.format("-------Saldo da conta: R$%s-----------",novaConta.getSaldoConta()));
        System.out.println(String.format("-------Insira o valor do saque: ------",novaConta.getSaldoConta()));
        valorManip = sc.nextDouble();
        novaConta.sacaDinheiro(valorManip);
        System.out.println(String.format("-------Novo saldo da conta: R$%s-----------",novaConta.getSaldoConta()));
        System.out.println(String.format("-------Insira o valor do depósito: ------",novaConta.getSaldoConta()));
        valorManip = sc.nextDouble();
        novaConta.depositoDinheiro(valorManip);
        System.out.println(String.format("-------Novo saldo da conta: R$%s-----------",novaConta.getSaldoConta()));
        System.out.println("-------Fim do banco da putaria--------");
        System.out.println("--------------------------------------------");
    }

}
