package atividades.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("Insira 5 cores: ");
		
		for(int x = 0; x < 5; x++ ) {
			String cor = scan.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nLista das 5 cores: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("\nCores em ordem alfabética: ");
		Collections.sort(cores);
		for(String cor : cores) {
			System.out.println(cor);
		}
	}

}
