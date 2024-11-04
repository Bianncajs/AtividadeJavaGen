package atividadecanvasmodulo8;

import java.util.Scanner;

public class Exercicio1_For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		int numero1 = scanner.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		int numero2 = scanner.nextInt();

		if (numero1 < numero2) {
			System.out.println("Números no intervalo:");
			for (int i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " É múltiplo de 3 e 5.");
				}
			}

		} else {
			System.out.println("Intervalo inválido. O segundo número é menor que o primeiro número. ");
			scanner.close();

		}
	}

}
