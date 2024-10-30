package atividade_lacos_condicionais;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número para saber se ele é positivo, negativo, par ou ímpar: ");
		num = scan.nextInt();
		
		scan.close();
		
		if(num % 2 == 0) {
			System.out.println("O número informado é Par");	
		}else{
			System.out.println("O número informado é Impar");
		}
		
		if(num >= 0) {
			System.out.println("O número informado é Positivo");
		}else {
			System.out.println("O número informado é Negativo");
		}
		
	}

}
