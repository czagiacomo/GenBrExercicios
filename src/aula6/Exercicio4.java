package aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//CALCULO = (n1 * n2) – (n3 * n4)
		
		Scanner scan = new Scanner(System.in);
		
		float num1, num2, num3, num4, dif;
		
		/* Valores de Referência 
		 * 
		 * CASO 1: 
		 * num1 = 5
		 * num2 = 6
		 * num3 = 7
		 * num4 = 8
		 * dif = -26.0
		 * 
		 * CASO 2:
		 * num1 = 5
		 * num2 = 6
		 * num3 = -7
		 * num4 = 8
		 * dif = 86.0
		 */
		
		System.out.println("Insira o primeiro Num a ser calculado: ");
		num1 = scan.nextFloat();
		
		System.out.println("Insira o segundo Num a ser calculado: ");
		num2 = scan.nextFloat();
		
		System.out.println("Insira o terceiro Num a ser calculado: ");
		num3 = scan.nextFloat();
		
		System.out.println("Insira o quarto Num a ser calculado: ");
		num4 = scan.nextFloat();
		
		System.out.println("O cálculo feito será: (num1 * num2) - (num3 * num4) = resultado\n");
		
		dif = (num1 * num2) - (num3 * num4);
		
		System.out.println("O resultado da conta foi: " + dif);
		
		scan.close();

	}

}
