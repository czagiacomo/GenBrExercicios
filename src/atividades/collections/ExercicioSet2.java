package atividades.collections;

import java.util.HashSet;
import java.util.Scanner;

public class ExercicioSet2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashSet<Integer> setNum = new HashSet<Integer>();

		setNum.add(2);
		setNum.add(5);
		setNum.add(1);
		setNum.add(3);
		setNum.add(4);
		setNum.add(9);
		setNum.add(7);
		setNum.add(8);
		setNum.add(10);
		setNum.add(6);

		System.out.println("Digite o número que deseja localizar: ");
		int entrada = scan.nextInt();
		scan.close();

		if (setNum.contains(entrada)) {
			System.out.println("O número " + entrada + " foi encontrado ");
		} else {
			System.out.println("O número " + entrada + " não foi encontrado ");
		}

	}

}
