package Exercicio06;

public class Main {

    public static void main (String[] args){ 

        ContaBancaria contaBancaria = new ContaBancaria();
        try {
        	 contaBancaria.setSaldo(100.50);
             contaBancaria.verSaldo();

             contaBancaria.setDeposito(30.5);
             contaBancaria.depositar();

             contaBancaria.setSaque(1500.4);
             contaBancaria.sacar();
             
             contaBancaria.verSaldo();
             
        }catch (SaldoInsuficienteException e) {
        	
        	System.out.println(e.getMessage());
        }
       
    }
}
