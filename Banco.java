package estrturadedados;


import java.util.LinkedList; // (usada para implementar a Queue)
import java.util.Queue; // (é a interface que define a fila, um parâmetro)
import java.util.Scanner; // (é utilizada para ler a entrada do usuário)

public class Banco {
	// Exercício 01 - Fila

	public static void main(String[] args) {

		Queue<String> filaDeClientes = new LinkedList<>(); // (criação da fila e scanner)
        Scanner scanner = new Scanner(System.in);          // (filaDeclientes é a fila que vai armazenar o nomes dos clientes)
        int opcao;

        do {
        // O menu é exibido e o programa lê a opção escolhida pelo usuário	
            System.out.println("Menu:");
            System.out.println("1: Adicionar um Cliente na fila");
            System.out.println("2: Listar todos os Clientes");
            System.out.println("3: Retirar um cliente da fila");
            System.out.println("0: Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1: // solicita o nome do cliente e o adiciona a fila "filaDeclientes.add(nome)"
                    System.out.print("Adicionar um Cliente na fila: ");
                    String nome = scanner.nextLine();
                    filaDeClientes.add(nome);
                    System.out.println("Cliente " + nome + " adicionado à fila.\n");
                    break;
                case 2: // verifica se a fila está vazia, se não estiver, repete sobre os elementos da fila para exibir cada cliente
                    if (filaDeClientes.isEmpty()) {
                        System.out.println("A fila está vazia.\n");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : filaDeClientes) {
                            System.out.println(cliente);
                        }
                        System.out.println();
                    }
                    break;
                case 3: // verifica se a fila está vazia, se não estiver, remove o cliente que está na frente da fila "filaDeClientes.poll"
                    if (filaDeClientes.isEmpty()) {
                        System.out.println("A fila está vazia!\n");
                    } else {
                        // Remove o primeiro cliente da lista
                        String clienteChamado = filaDeClientes.poll();
                        System.out.println("Cliente " + clienteChamado + " foi chamado.\n");
                    }
                    break;
                case 0: // finaliza a operação
                    System.out.println("Finalizando a operação...");
                    break;
                default: // trata as entradas como inválidas
                    System.out.println("Opção inválida. Digite um código válido.\n");
            }
        } while (opcao != 0); // "loop" continua sendo exibido até o cliente escolher a opção 0

        scanner.close();
	}

}
