package entities;

public class Employee {

	private String nome;
	private int id;
	private double salario;
	
	public Employee(int id, String nome, double salario) {
		
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	

	public void increaseSalary(double porcentagem) {
		 salario += salario * porcentagem / 100 ;
		
	}
	@Override
	public String toString() {
		return id 
			+ ", " 
			+ nome 
			+ ", $ " 
			+ String.format("%.2f", salario);
	}
	
	
	
	
}
