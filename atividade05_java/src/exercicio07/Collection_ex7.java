package exercicio07;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_ex7 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Sara");
        nomes.add("João");
        nomes.add("Willy");

        Collections.sort(nomes, Collections.reverseOrder());  // Ordena em ordem decrescente
        System.out.println("Lista em ordem decrescente: " + nomes);  // Exibe a lista
    }
}
