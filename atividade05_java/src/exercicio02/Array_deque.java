package exercicio02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_deque {
    public static void main(String[] args) {
        Deque<String> lista = new ArrayDeque<>();
        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");

        System.out.println("Primeiro elemento que será removido: " + lista.remove());  // Remove e exibe "Primeiro"
    }
}