package atividadecanvasmodulo9;

import java.util.Scanner;

public class Exercicio1_Vetores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = scanner.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == numero) {
				System.out.println("O Número " + numero + " está localizado na posição: " + i + "º");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O Número " + numero + " não foi encontrado! ");
		}

		scanner.close();
	}

}
