import java.util.Stack;

public class Pilha<T> {
    private Stack<T> stack = new Stack();

    public Pilha() {
    }

    public void push(T item) {
        this.stack.push(item);
    }

    public T pop() {
        return this.stack.pop();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public T peek() {
        return this.stack.isEmpty() ? null : this.stack.peek();
    }

    public String toString() {
        return this.stack.toString();
    }
}