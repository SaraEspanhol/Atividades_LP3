package Exercicio06;

public class ContaBancaria {

	private int numeroDaConta;
    private double saldo;
	private double deposito;
    private double saque;
    
    public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
    
    public void depositar(){

        saldo += deposito;
        System.out.println("Seu novo saldo é de R$ " + saldo);

    }

    public void sacar() throws SaldoInsuficienteException{

    	if (saque < saldo) {
        saldo = saldo - saque;
        System.out.println("Seu novo saldo é de R$ " + saldo);
    	}
    	else {
    		throw new SaldoInsuficienteException ("Saldo Insuficiente");
    	}

    }

    public void verSaldo(){
        
            System.out.println("Seu saldo atual é de R$ " + saldo);
    }

	
}
