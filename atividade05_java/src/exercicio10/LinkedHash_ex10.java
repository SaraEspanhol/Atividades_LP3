package exercicio10;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash_ex10 {
    public static void main(String[] args) {
        Set<String> frutas = new LinkedHashSet<>();
        frutas.add("Tangerina");
        frutas.add("Mexirica");
        frutas.add("Bergamota");
        frutas.add("Tangerina");  

        System.out.println(frutas);  // Exibe o conjunto
    }
}

