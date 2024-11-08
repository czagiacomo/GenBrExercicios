package atividades.estrutura.dados;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int opcao;
		
		menu();

		do {

			System.out.print("Escolha uma opção: ");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome do livro: ");
				String livro = scan.next();
				pilha.add(livro);
				lista(pilha);
				break;

			case 2:
				lista(pilha);
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");

				} else {
					pilha.pop();
					lista(pilha);
					System.out.println("Livro removido!");
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
		System.out.println("1: Adicionar livro na pilha");
		System.out.println("2: Listar todos os livros");
		System.out.println("3: Retirar livros da pilha");
		System.out.println("0: Sair");
		System.out.println("********************");
	}

	public static void lista(Stack<String> pilha) {
		for (String livro : pilha) {
			System.out.println(livro);
		}
	}

}
