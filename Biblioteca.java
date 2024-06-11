package estrturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Biblioteca {

	public static void main(String[] args) {
		
		Stack<String> prateleira = new Stack<>(); //armazena o nome dos livros prateleira (pilha de livros)
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu(); // mostrar opção para o usuário
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) { // depende das opção escolhida o sistema chama o método correspondente para adc, listar ou retirar
                case 1:
                    adicionarLivro(prateleira, scanner);
                    break;
                case 2:
                    listarLivros(prateleira);
                    break;
                case 3:
                    retirarLivro(prateleira);
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um código válido.");
            }
            System.out.println(); 
        } while (opcao != 0);

        scanner.close();
    }

    // Método para exibir o menu para o usuário
    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1: Adicionar livro na prateleira");
        System.out.println("2: Listar todos os livros");
        System.out.println("3: Retirar um livro da prateleira");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
    }

    // adicionar um livro à prateleira
    private static void adicionarLivro(Stack<String> prateleira, Scanner scanner) {
        System.out.print("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        prateleira.push(nomeLivro);
        System.out.println("Livro " + nomeLivro + " adicionado à prateleira.");
    }

    // listar todos os livros na prateleira
    private static void listarLivros(Stack<String> prateleira) {
        if (prateleira.isEmpty()) {
            System.out.println("A prateleira está vazia.");
        } else {
            System.out.println("Livros na prateleira:");
            for (String livro : prateleira) {
                System.out.println(livro);
            }
        }
    }

    // Método para retirar um livro da prateleira
    private static void retirarLivro(Stack<String> prateleira) {
        if (prateleira.isEmpty()) {
            System.out.println("Prateleira está vazia. Não há livros para retirar.");
        } else {
            String livroRetirado = prateleira.pop();
            System.out.println("Livro " + livroRetirado + " foi retirado.");
	}

    }
}
