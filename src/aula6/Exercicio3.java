package aula6;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		// SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
		
		Scanner scan = new Scanner(System.in);
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiq;
		
		/* Valores de Referência 
		 * salarioBruto = 2000.00
		 * addNoturno = 500.00
		 * horasExtras = 100.00
		 * descontos = 200.00
		 * salarioLiq = 2800.00
		 */
		
		System.out.println("Insira o Salário Bruto");
		salarioBruto = scan.nextFloat();

		System.out.println("Insira o Adicional Norturno");
		addNoturno = scan.nextFloat();
		
		System.out.println("Insira as Horas Extras");
		horasExtras = scan.nextFloat();
		
		System.out.println("Insra os Descontos");
		descontos = scan.nextFloat();
		
		salarioLiq = salarioBruto + addNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu slário líquido ficou em: " + salarioLiq);
		
		scan.close();

	}

}
