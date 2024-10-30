package atividadecanvasmodulo6;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		  float Nota1;
		  float Nota2;
		  float Nota3;
		  float Nota4;
		  float MediaFinal;
		  
	System.out.println("Digite sua primeira nota: ");	
	Nota1 = ler.nextFloat();
		  
	System.out.println("Digite sua segunda nota: ");	
	Nota2 = ler.nextFloat();
	
	System.out.println("Digite sua terceira nota: ");
	Nota3 = ler.nextFloat();
	
	System.out.println("Digite sua quarta nota: ");
	Nota4 = ler.nextFloat();
	
	     MediaFinal = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
	     
	     
	 System.out.println("Sua Média final é de: " + MediaFinal); 

	}

}
