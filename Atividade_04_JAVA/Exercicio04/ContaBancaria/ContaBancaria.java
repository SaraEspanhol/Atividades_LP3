package Exercicio04.ContaBancaria;

public class ContaBancaria {
    
    int numeroDaConta;
    double saldo;
    double deposito;
    double saque;

    public void depositar(){

        saldo += deposito;
        System.out.println("Seu novo saldo é de R$ " + saldo);

    }

    public void sacar(){

        saldo = saldo - saque;
        System.out.println("Seu novo saldo é de R$ " + saldo);

    }

    public void verSaldo(){
        
            System.out.println("Seu saldo atual é de R$ " + saldo);
    }
}
