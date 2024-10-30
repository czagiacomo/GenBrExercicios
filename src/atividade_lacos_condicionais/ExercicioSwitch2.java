package atividade_lacos_condicionais;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome, cargo = "";
		int opcao;
		float salario, novoSalario, reajuste = 0;
		
		System.out.println("Digite o nome do empregado: ");
		nome = scan.next();

		menu();
		opcao = scan.nextInt();
			
		System.out.println("Digite o salário do empregado: ");
		salario = scan.nextFloat();
		
		scan.close();
		
		switch(opcao) {
		
		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
			
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
			
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
			
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
			
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
			
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
			
		default:
			System.out.println("Inválido");
		
		}
		
		novoSalario = salario + (reajuste  * salario);
		
		System.out.println("\nNome: " + nome);
		System.out.printf("Sálario ajustado R$: %.2f \n", novoSalario);
		System.out.println("Cargo: " + cargo);

	}
	
	public static void menu() {
		System.out.println("Digite o código do cargo do empregado: ");
		System.out.println("1- Gerente");
		System.out.println("2- Vendedor");
		System.out.println("3- Supervisor");
		System.out.println("4- Motorista");
		System.out.println("5- Estoquista");
		System.out.println("6- Técnico de TI");
	}

}
