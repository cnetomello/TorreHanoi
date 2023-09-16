public class Disco {
    private int tamanho;

    public Disco(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String toString() {
        return "Disco de tamanho " + this.tamanho;
    }
}
