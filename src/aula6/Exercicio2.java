package aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		/* Valores de Referência 
		 * Nota 1 = 10,0
		 * Nota 2 = 8,0
		 * Nota 3 = 7,0
		 * Nota 4 = 7,5
		 * Média Final = 8,1
		 */
		
		System.out.println("Insira a primeira nota: ");
		nota1 = scan.nextFloat();
		System.out.println("Insira a segunda nota: ");
		nota2 = scan.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = scan.nextFloat();
		System.out.println("Insira a quarta nota: ");
		nota4 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Sua média final foi: %.1f" , media);
		
		scan.close();
	}

}
