package application;

import java.util.Locale;
import java.util.Scanner;

import entities.studenty;

public class ProgramS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Locale.setDefault(Locale.US);	
    Scanner sc = new Scanner(System.in) ;
    
    studenty student = new studenty(); 
    
    System.out.println("Digite seu nome: ");
    student.name = sc.next();
    System.out.println("Digite a primeira nota do trimestre: (max: 30)");
    student.nota1 = sc.nextDouble();
    System.out.println("Digite a segunda nota do trimestre: (max: 35)");
    student.nota2 = sc.nextDouble();
    System.out.println("Digite a terceira nota do trimestre: (max: 35)");
    student.nota3 = sc.nextDouble();
    
    System.out.println();
    System.out.println("FINAL GRADE = " + student);
    
    double resultado = student.notaFinal();
    
    if (resultado >= 60) {
		System.out.println("PASS");
	} else {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", 60 - resultado);
	}
    
    
    sc.close();
    
	}

}
