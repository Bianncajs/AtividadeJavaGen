package atividadecanvasmodulo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 5 cores:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Cor " + (i + 1) + ": ");
			String cor = scanner.nextLine();
			cores.add(cor);

		}

		System.out.println("\nCores adicionadas:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nCores ordenadas em ordem crescente:");
		for (String cor : cores) {
			System.out.println(cor);

			scanner.close();
		}

	}

}