package aula6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		/* Valores de Referência 
		 * Salário = 10000,00
		 * Abono = 1000,00
		 * Salário Final = 11000,00
		 */
		
		System.out.println("*** Calculadora de Salário ***");
		System.out.println();
		System.out.println("Insira o Salário a ser calculado: ");
		salario = scan.nextFloat();
		
		System.out.println();
		System.out.println("Insira o Abono a ser calculado: ");
		abono = scan.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println();
		System.out.printf("Seu Salário Final é: %.2f" , novoSalario);

		scan.close();
	}
}
