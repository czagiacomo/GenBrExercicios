package atividade_lacos_condicionais;

import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numA, numB, numC;
		
		System.out.println("Insira o primeiro número (Número A): ");
		numA = scan.nextInt();
		System.out.println("Insira o segundo número (Número B): ");
		numB = scan.nextInt();
		System.out.println("Insira o terceiro número (Número C): ");
		numC = scan.nextInt();
		
		scan.close();
		
		if(numC < (numA + numB)) {
			System.out.println("A soma do Número A + Número B é maior do que o Número C");
			
		}else if(numC > (numA + numB)) {
			System.out.println("A soma do Número A + Número B é menor do que o Número C");
			
		}else if(numC == (numA + numB)) {
			System.out.println("A soma do Número A + Número B é igual ao Número C");
			
		}else {
			System.out.println("Algo deu errado, tente novamente.");
		}

	}

}
