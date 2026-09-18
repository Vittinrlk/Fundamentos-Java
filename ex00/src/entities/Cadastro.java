package entities;

public class Cadastro {

	private int numeroConta;
	private String name;
	private double saldo;

	

	public Cadastro(int numeroConta, String name, double saldo) {
		this.name = name;
		this.numeroConta = numeroConta;
		this.saldo = saldo;

	}

	public Cadastro(int numerodaConta, String name) {
		this.name = name;
		this.numeroConta = numerodaConta;
		this.saldo = 0;
	}


 
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public int getNumerodaconta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double valor) {
	    saldo += valor;
	}
	
	public void saque(double valor) {
	    saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", saldo) ;
		
	}
	
	
	
	
	
}