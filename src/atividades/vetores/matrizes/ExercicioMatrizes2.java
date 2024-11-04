package atividades.vetores.matrizes;

import java.util.Scanner;

public class ExercicioMatrizes2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float[][] notas = new float[10][4];
		float[] medias = new float[10];

		System.out.println("Digite as notas dos 10 participantes para os 4 bimestres:");
		for (int x = 0; x < 10; x++) {
			System.out.println("Participante " + (x + 1) + ":");
			float soma = 0;
			for (int y = 0; y < 4; y++) {
				System.out.print("Nota do " + (y + 1) + "º bimestre: ");
				notas[x][y] = scan.nextFloat();
				soma += notas[x][y];
			}

			medias[x] = soma / 4;
		}
		System.out.println("\nMédias dos Participantes:");
		for (int x = 0; x < 10; x++) {
			System.out.printf("| %.1f ", medias[x]);
		}
		System.out.print("|");
		scan.close();
	}
}
