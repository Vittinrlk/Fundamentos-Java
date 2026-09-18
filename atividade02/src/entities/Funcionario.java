package entities;

public class Funcionario {
	
	public double salarioBruto;
	public String nome;
	public double imposto;
	
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentosalario(double porcentagem) {
	    salarioBruto += salarioBruto * porcentagem / 100.0;
	}
    public String toString() {
    	return nome
    		   + ", $ "
               + String.format("%.2f", salarioLiquido());
   
    }
}