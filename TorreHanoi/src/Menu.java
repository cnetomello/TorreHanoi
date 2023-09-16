import java.util.Stack;
import java.util.Scanner;

public class Menu {
    public void exibirOpcoes() {
        System.out.println("\nOpções:");
        System.out.println("0 - Sair do jogo");
        System.out.println("1 - Movimentar");
        System.out.println("2 - Solução automática");
        System.out.print("Escolha uma opção: ");
    }

    public void movimentar(Pilha source, Pilha destination, Pilha aux, char order) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a pilha de origem (1, 2, ou 3): ");
        int sourceStack = scanner.nextInt();
        System.out.print("Digite a pilha de destino (1, 2, ou 3): ");
        int destinationStack = scanner.nextInt();

        if (sourceStack >= 1 && sourceStack <= 3 && destinationStack >= 1 && destinationStack <= 3) {
            source.moverNumeroPara(destination, order);
        } else {
            System.out.println("Pilhas inválidas. Tente novamente.");
        }
    }

    public void solucaoAutomatica(Pilha source, Pilha aux, Pilha target, char order) {
        if (order == 'c') {
            source.resolverTorreHanoi(source.getTamanho(), source, aux, target);
        } else if (order == 'd') {
            target.resolverTorreHanoi(target.getTamanho(), target, aux, source);
        }
    }

    public void exibirPilhas(Pilha stack1, Pilha stack2, Pilha stack3) {
        System.out.println("Pilha 1: " + stack1);
        System.out.println("Pilha 2: " + stack2);
        System.out.println("Pilha 3: " + stack3);
    }
}
