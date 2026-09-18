package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Retangulo ret;
	ret = new Retangulo();
	
	
	System.out.println("Enter rectangle widht and height");
	ret.altura = sc.nextDouble();
	ret.largura = sc.nextDouble();
	
	double areaR = ret.area();
	double perimetroR = ret.perimetro();
	double diagonalR = ret.diagonal();
	
	System.out.printf("A area do retangulo é:  %.2f%n " , areaR);
	System.out.printf("O perimetro é: %.2f%n" ,  perimetroR);
	System.out.printf("Diagonal é: %.2f%n" , diagonalR );
	
	
	sc.close();

	}

}
