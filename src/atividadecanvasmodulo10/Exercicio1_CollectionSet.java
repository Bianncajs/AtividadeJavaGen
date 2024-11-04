package atividadecanvasmodulo10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1_CollectionSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros não repetidos:");

		while (numeros.size() < 10) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();

			if (!numeros.add(numero)) {
				System.out.println("Número repetido! Tente novamente.");
			}
		}

		scanner.close();

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
