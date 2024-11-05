package atividadecanvasmodulo11;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("#########################################################");
			System.out.println("Digite a opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				String livro = scanner.nextLine();
				pilha.push(livro);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Lista de livros na pilha: ");
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					for (int i = pilha.size() - 1; i >= 0; i--) {
						System.out.println(pilha.get(i));
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livroRemovido = pilha.pop(); 
					System.out.println("Livro removido da pilha: " + livroRemovido);
				}
				break;
			case 0:
				System.out.println("Programa finalizado! ");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
		} while (opcao != 0);

		scanner.close(); 
	}
}
