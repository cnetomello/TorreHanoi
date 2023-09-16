import java.util.Scanner;

public class Menu {
    private Pilha<Integer> pilha1;
    private Pilha<Integer> pilha2;
    private Pilha<Integer> pilha3;

    public Menu(Pilha<Integer> pilha1, Pilha<Integer> pilha2, Pilha<Integer> pilha3) {
        this.pilha1 = pilha1;
        this.pilha2 = pilha2;
        this.pilha3 = pilha3;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("\nEstado das pilhas:");
                System.out.println("Pilha1: " + String.valueOf(this.pilha1));
                System.out.println("Pilha2: " + String.valueOf(this.pilha2));
                System.out.println("Pilha3: " + String.valueOf(this.pilha3));
                System.out.println("\nMenu de Opções:");
                System.out.println("0 - Sair do jogo");
                System.out.println("1 - Movimentar");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 0:
                        System.out.println("Obrigado por jogar!");
                        scanner.close();
                        System.exit(0);
                        break;
                    case 1:
                        this.movimentar();
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }

    private void movimentar() {
    }
}