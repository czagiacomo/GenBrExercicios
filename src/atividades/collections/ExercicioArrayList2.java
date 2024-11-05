package atividades.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList2 {

	public static void main(String[] args) {

		int indice;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);

		System.out.println("Digite o número que deseja localizar: ");
		int entrada = scan.nextInt();
		scan.close();

		if (num.contains(entrada)) {
			indice = num.indexOf(entrada);
			System.out.println("O valor " + entrada + " está na posição " + indice);
		} else {
			System.out.println("O número " + entrada + " não foi encontrado ");
		}
	}
}
