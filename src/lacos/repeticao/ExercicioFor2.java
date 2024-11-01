package lacos.repeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int inicio, fim;

		System.out.println("Digite o primeiro número: ");
		inicio = scan.nextInt();

		System.out.println("Digite o último número: ");
		fim = scan.nextInt();

		scan.close();

		if (inicio >= fim) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("No Intervalo entre " + inicio + " e " + fim + ":");

			for (int n = inicio; n <= fim; n++) {
				if (n % 3 == 0 && n % 5 == 0) {
					System.out.println(n + " é múltiplo de 3 e 5");
				}
			}
		}

	}

}
