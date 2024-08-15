package exercicio05;


import java.util.LinkedList;

public class LinkedList_ex5 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        lista.addFirst("Elemento 0");  // Adiciona ao início da lista
        System.out.println("LinkedList: " + lista);  // Exibe a lista
    }
}