package lacos.repeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menor21 = 0, maior50 = 0, idade;
		
		System.out.println("Digite a idade: ");
		idade = scan.nextInt();

		while (idade >= 0) {

			System.out.println("Digite a idade: ");
			idade = scan.nextInt();

			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
	}
}