import java.util.Stack;

public class Pilha {
    private Stack<Disco> pilha;
    private int tamanho;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new Stack<>();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void preencherPilhaAleatoriamente() {
        for (int i = tamanho; i > 0; i--) {
            int tamanhoDisco = (int) (Math.random() * 100) + 1;
            Disco disco = new Disco(tamanhoDisco);
            pilha.push(disco);
        }
    }

    public void limpar() {
        pilha.clear();
    }

    public void moverNumeroPara(Pilha destino, char order) {
        if (!pilha.isEmpty()) {
            Disco disco = pilha.pop();
            if (destino.pilha.isEmpty() || disco.getTamanho() < destino.pilha.peek().getTamanho()) {
                destino.pilha.push(disco);
            } else {
                System.out.println("Você não pode mover um número sobre um menor!");
                pilha.push(disco);
            }
        }
    }

    public boolean estaOrdenada(char order) {
        Stack<Disco> tempPilha = new Stack<>();
        int prev = order == 'c' ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        while (!pilha.isEmpty()) {
            Disco current = pilha.pop();
            if ((order == 'c' && current.getTamanho() > prev) ||
                    (order == 'd' && current.getTamanho() < prev)) {
                return false;
            }
            tempPilha.push(current);
            prev = current.getTamanho();
        }

        while (!tempPilha.isEmpty()) {
            pilha.push(tempPilha.pop());
        }

        return true;
    }

    public void resolverTorreHanoi(int n, Pilha source, Pilha auxiliary, Pilha target) {
        if (n > 0) {
            resolverTorreHanoi(n - 1, source, target, auxiliary);
            source.moverNumeroPara(target, 'c'); // Assumindo que a ordem é sempre crescente na solução automática
            resolverTorreHanoi(n - 1, auxiliary, source, target);
        }
    }

    @Override
    public String toString() {
        return pilha.toString();
    }
}
