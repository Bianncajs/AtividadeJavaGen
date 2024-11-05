package atividadecanvasmodulo11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); 
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
            System.out.println("1 - Adicionar Cliente na fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Chamar Cliente da fila");
            System.out.println("0 - Sair");
            System.out.println("#########################################################");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String cliente = scanner.nextLine();
                    fila.add(cliente);
                    System.out.println("Cliente adicionado na fila!");
                    break;
                case 2:
                    System.out.println("Lista de Clientes na Fila:");
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        for (String c : fila) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        String clienteChamado = fila.poll();
                        System.out.println("Cliente chamado: " + clienteChamado);
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida, Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

}
