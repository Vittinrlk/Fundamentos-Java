package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();	
		System.out.println("Is there na initial deposit (y/n)?  ");
		char resp = sc.next().charAt(0);
		
		Cadastro cadastro;
		

		if (resp == 'y') {
		    System.out.println("Enter initial deposit value: ");
		    double saldo = sc.nextDouble();
		    cadastro = new Cadastro(numeroConta, name, saldo);
		} else {
		    cadastro = new Cadastro(numeroConta, name);
		}
		
		
		System.out.println("Account data:");
		
		System.out.println();
		System.out.println("Account " + cadastro);
		
		System.out.println();
		System.out.println("Enter deposit value:");
		double depositValue = sc.nextDouble();
		cadastro.deposito(depositValue);
		
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(cadastro);
		
		
		System.out.println();
		System.out.println("Enter withdraw value: ");
		double withdraw = sc.nextDouble();
		cadastro.saque(withdraw);
		
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(cadastro);
		
		
		
		sc.close();
	

    }
}