package exercicio_04;

public class Main {
    
    public static void main (String[] args){ 

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.saldo = 100.50;
        contaBancaria.verSaldo();

        contaBancaria.deposito = 30.5;
        contaBancaria.depositar();

        contaBancaria.saque = 22.4;
        contaBancaria.sacar();
        
        contaBancaria.verSaldo();

    }
}
