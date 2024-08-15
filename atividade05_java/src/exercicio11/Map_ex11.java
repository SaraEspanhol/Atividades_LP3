package exercicio11;


import java.util.HashMap;
import java.util.Map;

public class Map_ex11 {
    public static void main(String[] args) {
        Map<String, Integer> idade = new HashMap<>();
        idade.put("Willy", 3);
        idade.put("Sara", 25);
        idade.put("João", 24);

        System.out.println("Idade da Sara: " + idade.get("Sara"));  // Exibe a idade de Sara
    }
}
