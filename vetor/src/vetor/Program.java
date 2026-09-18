package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vao ser digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.println("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.println("Idades: ");
			idades[i] = sc.nextInt();
			System.out.println("Alturas: ");
			alturas[i] = sc.nextDouble();
		}
	
		double soma = 0.0;
		for(int i = 0; i<n; i++) {
			soma = soma + alturas[i];
		}
		
	    double mediaAlturas = soma / n;
	    
	    System.out.println();
	    System.out.printf("Altura media: %.2f%n" , mediaAlturas);
		
	    int cont = 0;
	    for(int i = 0; i<n; i++) {
	    	if (idades[i] < 16) {
	    		cont++;
	    	System.out.println(nomes[i]);	
	    		
	    	}
	    }
	    
		sc.close();

	}

}
