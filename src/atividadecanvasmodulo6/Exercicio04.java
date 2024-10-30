package atividadecanvasmodulo6;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		float N1;
		float N2; 
		float N3; 
		float N4;
		float Diferenca;
		
		
		System.out.println("Digite um número: ");	
		N1 = ler.nextFloat();		
		
		System.out.println("Digite outro número: ");	
		N2 = ler.nextFloat();	
		
		System.out.println("Digite outro número: ");	
		N3 = ler.nextFloat();	
		
		System.out.println("Digite o último número ");	
		N4 = ler.nextFloat();	
		
		
		Diferenca = (N1 * N2) - (N3 *N4);
		
		
	System.out.println("A diferença é de: " + Diferenca);

	}

}
