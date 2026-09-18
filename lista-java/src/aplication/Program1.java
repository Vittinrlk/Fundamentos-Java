package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Quantos funcionarios seram digitados? ");
		System.out.println();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Funcionarios #" + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			list.add(new Employee(id, nome, salario));

		}

		for (Employee x : list) {
			System.out.println(x);

			
		}
		
		System.out.print("Digite o id do funcionario que vai receber aumento: ");
		int idBusca = sc.nextInt();

		
		Employee emp = null;

		for (Employee x : list) {
			if (x.getId() == idBusca) {
				emp = x;
			    break;
			}
			
			
				}
		if (emp == null) {
			System.out.println("Id nao existe!");
			
		} else {
			
				System.out.print("Digite a porcentagem: ");
				double porcentagem = sc.nextDouble();
				
				emp.increaseSalary(porcentagem);
		
				System.out.println();
				System.out.println("Lista atualizada:");

				for (Employee x : list) {
					System.out.println(x);
		
				}
		
			}
		  sc.close();
        }
    
	}



