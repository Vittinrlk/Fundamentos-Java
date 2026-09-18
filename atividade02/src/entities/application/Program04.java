package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		
        Funcionario fun = new Funcionario();
        
        System.out.println("Infomre seu nome: ");
        fun.nome = sc.next();
        System.out.println("Infomre seu salario: ");
        fun.salarioBruto = sc.nextDouble();
        System.out.println("Infomre seu imposto: ");
        fun.imposto = sc.nextDouble();
       
        
        System.out.println();
        System.out.println("Funcionarios: " + fun.toString());
		
        System.out.println();
        System.out.println("Digite o aumento da porcentagem do salario :");
        double porcentagem = sc.nextDouble();
        fun.aumentosalario(porcentagem);
        
        System.out.println();
        System.out.println("Dados autalizado: " + fun.toString());
        
        sc.close();
        	
        	
        	
        }

}
