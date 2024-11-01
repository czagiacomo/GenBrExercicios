package lacos.repeticao;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0, numero;

		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();

			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma);

		scan.close();

	}

}
