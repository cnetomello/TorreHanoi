import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public Jogo() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo com Pilhas!");
        System.out.print("Informe o tamanho das pilhas: ");
        int tamanhoPilhas = scanner.nextInt();
        Pilha<Integer> pilha1 = new Pilha();
        Pilha<Integer> pilha2 = new Pilha();
        Pilha<Integer> pilha3 = new Pilha();
        Random random = new Random();

        for(int i = 0; i < tamanhoPilhas; ++i) {
            pilha1.push(random.nextInt(100) + 1);
        }

        Menu menu = new Menu(pilha1, pilha2, pilha3);
        menu.executar();
    }
}