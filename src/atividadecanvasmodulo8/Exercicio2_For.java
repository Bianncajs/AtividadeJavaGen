package atividadecanvasmodulo8;

import java.util.Scanner;

public class Exercicio2_For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int totalPares = 0;
		int totalImpares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "ª número: ");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				totalPares++;

			} else {
				totalImpares++;

			}
		}

		System.out.println("Total de números pares: " + totalPares);
		System.out.println("Total de números impares: " + totalImpares);

		scanner.close();
	}

}
