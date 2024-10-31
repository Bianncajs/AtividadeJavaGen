package atividadecanvasmodulo9;

import java.util.Scanner;

public class Exercicio2_Vetores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorInteiros = new int[10];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = scanner.nextInt();
		}

		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 1; i < vetorInteiros.length; i += 2) {
			System.out.print(vetorInteiros[i] + " ");
		}

		System.out.println("\n\nElementos pares: ");
		for (int numero : vetorInteiros) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		}

		int soma = 0;
		for (int numero : vetorInteiros) {
			soma += numero;
		}
		double media = soma / 10.0;

		System.out.println("\n\nSoma: " + soma);
		System.out.printf("Média: %.2f%n", media);

		scanner.close();
	}
}