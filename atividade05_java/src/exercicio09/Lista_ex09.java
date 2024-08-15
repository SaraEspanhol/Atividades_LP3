package exercicio09;


import java.util.ArrayList;
import java.util.List;

public class Lista_ex09 {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Violeta");
        cores.add("Preto");
        cores.add("Cinza");

        System.out.println("Cor no segundo índice: " + cores.get(1));  // Exibe o nome no índice 01
    }
}
