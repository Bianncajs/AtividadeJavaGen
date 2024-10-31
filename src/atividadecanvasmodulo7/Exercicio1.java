package atividadecanvasmodulo7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int A, B, C;

		System.out.println("Digite o número A: ");
		A = leia.nextInt();

		System.out.println("Digite o número B: ");
		B = leia.nextInt();

		System.out.println("Digite o número C: ");
		C = leia.nextInt();

		if ((A + B) > C) {
			System.out.println(" A soma de A + B é maior do que C! ");
		}

		if ((A + B) < C) {
			System.out.println(" A soma de A + B é menor do que C! ");
		}

		if ((A + B) == C) {
			System.out.println(" A soma de A + B é igual a C! ");
		}

		leia.close();
	}

}
