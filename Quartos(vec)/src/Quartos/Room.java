package Quartos;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Room {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serao alugados? ");
		int n = sc.nextInt();
		
		// 🔥 vetor de OBJETOS (não é mais String)
		Rent[] vect = new Rent[10];
		
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			// 🔥 guarda o objeto no quarto
			vect[quarto] = new Rent(nome, email);
		}
		
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}