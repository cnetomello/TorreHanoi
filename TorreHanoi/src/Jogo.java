import java.util.Stack;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo das Pilhas!");

        System.out.print("Informe o tamanho das pilhas: ");
        int size = scanner.nextInt();

        System.out.print("Deseja ordenar em ordem crescente (c) ou decrescente (d)? ");
        char order = scanner.next().charAt(0);

        Pilha stack1 = new Pilha(size);
        Pilha stack2 = new Pilha(size);
        Pilha stack3 = new Pilha(size);

        if (order == 'd') {
            stack1.limpar();
            stack2.limpar();
            stack3.limpar();
            stack3.preencherPilhaAleatoriamente();
        } else {
            stack1.preencherPilhaAleatoriamente();
        }

        int moves = 0;
        Menu menu = new Menu();
        while (true) {
            menu.exibirOpcoes();
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Jogo encerrado.");
                break;
            } else if (choice == 1) {
                menu.movimentar(stack1, stack2, stack3, order);
                moves++;
                menu.exibirPilhas(stack1, stack2, stack3);
                if (stack1.estaOrdenada(order)) {
                    System.out.println("Ordenação concluída em " + moves + " jogadas.");
                    break;
                }
            } else if (choice == 2) {
                menu.solucaoAutomatica(stack1, stack2, stack3, order);
                menu.exibirPilhas(stack1, stack2, stack3);
                System.out.println("Ordenação concluída em " + ((int) Math.pow(2, size) - 1) + " jogadas.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
