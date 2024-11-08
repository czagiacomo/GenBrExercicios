package atividades.estrutura.dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		int opcao;
		
		menu();

		do {

			System.out.print("Escolha uma opção: ");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do cliente: ");
				String pessoa = scan.next();
				fila.add(pessoa);
				lista(fila);
				break;

			case 2:
				lista(fila);
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");

				} else {
					fila.remove();
					lista(fila);
					System.out.println("Cliente removido!");
				}
				break;

			case 0:
				System.out.println("Finalizando o programa...");
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

		} while (opcao != 0);

		scan.close();

	}

	public static void menu() {

		System.out.println("\n********** Menu **********");
		System.out.println("1: Adicionar cliente na fila");
		System.out.println("2: Listar todos os Clientes");
		System.out.println("3: Retirar cliente da fila");
		System.out.println("0: Sair");
		System.out.println("********************");
	}

	public static void lista(Queue<String> fila) {
		for (String pessoa : fila) {
			System.out.println(pessoa);
		}
	}

}
