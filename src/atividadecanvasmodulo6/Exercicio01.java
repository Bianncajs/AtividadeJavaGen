package atividadecanvasmodulo6;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
				
				float salario;
				float abono;
				float NovoSalario;
			
				
			System.out.println("Digite o Salário: ");	
			salario = ler.nextFloat();
				
			System.out.println("Digite o Abono: ");	
			abono = ler.nextFloat();
			
		       NovoSalario = salario + abono;
			
			System.out.println("Seu novo Salário é de: " + NovoSalario);

	}

}
