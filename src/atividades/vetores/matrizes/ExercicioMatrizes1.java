package atividades.vetores.matrizes;

import java.util.Scanner;

public class ExercicioMatrizes1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print("Elemento [" + x + "][" + y + "]: ");
				matriz[x][y] = scan.nextInt();
			}
		}

		System.out.println("Elementos da Diagonal Principal:");
		for (int x = 0; x < 3; x++) {
			System.out.print(matriz[x][x] + " ");
			somaDiagonalPrincipal += matriz[x][x];
		}

		System.out.println("Elementos da Diagonal Secundária:");
		for (int x = 0; x < 3; x++) {
			System.out.print(matriz[x][2 - x] + " ");
			somaDiagonalSecundaria += matriz[x][2 - x];
		}

		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);

		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

		scan.close();
	}
}
