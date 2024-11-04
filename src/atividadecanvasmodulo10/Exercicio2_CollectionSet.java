package atividadecanvasmodulo10;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio2_CollectionSet {

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroDigitado = scanner.nextInt();

		if (numeros.contains(numeroDigitado)) {
			System.out.println("Número " + numeroDigitado + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

		scanner.close();
	}
}
