package atividades.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioSet1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashSet<Integer> setNum = new HashSet<Integer>();

		System.out.println("Digite 10 números: ");

		for (int x = 0; x < 10; x++) {
			setNum.add(scan.nextInt());
		}

		Iterator<Integer> iNum = setNum.iterator();
		
		System.out.println("\nLista dos números: ");
		
		while (iNum.hasNext()) {
			System.out.println(iNum.next());
		}

	}

}
