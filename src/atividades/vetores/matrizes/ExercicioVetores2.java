package atividades.vetores.matrizes;

import java.util.Scanner;

public class ExercicioVetores2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[10];
		float soma = 0;

		System.out.println("Digite 10 números inteiros");
		for (int n = 0; n < vetor.length; n++) {
			System.out.print("Número " + (n + 1) + ": ");
			vetor[n] = scan.nextInt();
			soma += vetor[n];
		}

		System.out.println("Elementos nos índices ímpares:");
		for (int n = 1; n < vetor.length; n += 2) {
			System.out.println(vetor[n] + " ");
		}

		System.out.println("Elementos pares:");
		for (int num : vetor) {
			if (num % 2 == 0) {
				System.out.println(num + " ");
			}
		}

		float media = soma / vetor.length;

		System.out.printf("Soma: %.0f \n", soma);
		System.out.printf("Média: %.2f \n", media);

		scan.close();
	}
}
