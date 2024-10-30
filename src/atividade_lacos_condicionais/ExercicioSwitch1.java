package atividade_lacos_condicionais;

import java.util.Scanner;

public class ExercicioSwitch1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcao, quantidade, preco = 0;
		float valorTotal;
		String produto = "";
		
		opcao = scan.nextInt();
		quantidade = scan.nextInt();
		
		scan.close();
		
		
		switch(opcao) {
		
		case 1:
			preco = 10;
			produto = "Cachorro Quente";
			break;
			
		case 2:
			preco = 15;
			produto = "X-Salada";
			break;
			
		case 3:
			preco = 18;
			produto = "X-Bacon";
			break;
			
		case 4:
			preco = 12;
			produto = "Bauru";
			break;
			
		case 5:
			preco = 8;
			produto = "Refrigerante";
			break;
			
		case 6:
			preco = 13;
			produto = "Suco de Laranja";
			break;
			
		default:
			System.out.println("Inválido");
			
		}
		valorTotal = quantidade * preco;
		System.out.printf("Produto: " + produto + ". Valor Total: R$ %.2f", valorTotal);

	}

}
