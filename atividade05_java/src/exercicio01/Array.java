package exercicio01;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] materiais_escolares = {"Lápis", "Caneta", "Caderno", "Tesoura"};
        Arrays.sort(materiais_escolares);  // Ordena o array
        System.out.println(Arrays.toString(materiais_escolares));  // Exibe o array ordenado

        int index = Arrays.binarySearch(materiais_escolares, "Tesoura");  // Busca "Tesoura"
        System.out.println("Index da Tesoura: " + index);  // Exibe o índice de "Tesoura"
    }
}
