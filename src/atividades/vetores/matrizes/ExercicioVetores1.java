package atividades.vetores.matrizes;

import java.util.Scanner;

public class ExercicioVetores1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero, posicao = -1;
		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Qual número que você deseja encontrar: " );
		numero = scan.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
			}
		}

		if (posicao != -1) {
			System.out.println("O número " + numero + " está na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado");
		}

		scan.close();
	}
}
