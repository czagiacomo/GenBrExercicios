package lacos.repeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pares = 0, impares = 0;

		for (int n = 1; n <= 10; n++) {
			System.out.print("Digite o " + n + "º número: ");
			int numero = scan.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);

		scan.close();

	}

}
