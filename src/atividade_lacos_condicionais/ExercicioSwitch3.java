package atividade_lacos_condicionais;

import java.util.Scanner;

public class ExercicioSwitch3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		float dinheiro, saldo = 1000, novoSaldo;
		
		menu();
		
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("\n#####   Operação - Saldo   #####");
				System.out.printf("\nSeu saldo é: %.2f" , saldo);
				break;
				
			case 2:
				System.out.println("\n#####   Operação - Saque   #####");
				System.out.printf("\nSaldo atual: %.2f", saldo);
				System.out.println("\n\nDigite a quantia que deseja Sacar: ");
				dinheiro = scan.nextFloat();
				if(saldo >= dinheiro){
					novoSaldo = saldo - dinheiro;
					System.out.printf("\nSeu novo saldo é: %.2f" , novoSaldo);
				}else {
					System.out.println("Saldo Insuficiente!");
				}
				break;
				
			case 3:
				System.out.println("\n#####   Operação - Depósito   #####");
				System.out.printf("\nSaldo atual: %.2f", saldo);
				System.out.println("\n\nDigite a quantia que deseja Depositar: ");
				dinheiro = scan.nextFloat();
				novoSaldo = saldo + dinheiro;
				System.out.printf("Seu novo saldo é: %.2f" , novoSaldo);
				break;
				
			default:
				System.out.println("\n#####   Operação Inválida!   #####");
			
		}
		
		scan.close();
	}
	
	public static void menu() {
		System.out.println("#####   Selecione a Operação Desejada:   #####");
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Depósito");

	}
}
