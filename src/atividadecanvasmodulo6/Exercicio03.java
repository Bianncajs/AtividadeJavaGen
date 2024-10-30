package atividadecanvasmodulo6;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
	 Scanner ler = new Scanner(System.in);
		
		float SalarioB;
		float AdNoturno;
		float HrExtras;
		float DescColab;
		float SalarioL;
		
		System.out.println("Digite o salário bruto: ");	
		SalarioB = ler.nextFloat();	
		
		System.out.println("Digite o adicional noturno: ");	
		AdNoturno = ler.nextFloat();	
		
		System.out.println("Digite a hora extra: ");	
		HrExtras = ler.nextFloat();
		
		System.out.println("Digite o desconto: ");	
		DescColab = ler.nextFloat();
		
		
		SalarioL = SalarioB + AdNoturno + (HrExtras * 5) - DescColab;
		
		System.out.println("O salário Líquido é de: " + SalarioL); 

	}

}
