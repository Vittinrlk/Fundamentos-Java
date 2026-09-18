package entities;

public class studenty {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
		
	}
	public String toString() {
		return String.format("%.2f" , notaFinal());
	}
	
	
	
}
