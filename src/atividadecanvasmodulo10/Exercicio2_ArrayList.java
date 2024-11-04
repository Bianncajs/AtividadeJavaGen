package atividadecanvasmodulo10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

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

		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroDigitado = scanner.nextInt();

		boolean encontrado = false;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i).equals(numeroDigitado)) {
				System.out.println("O número " + numeroDigitado + " foi encontrado na posição: " + i + "º");
				encontrado = true;
				break;
			}

		}

		if (!encontrado) {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");

		}

		scanner.close();

	}

}
