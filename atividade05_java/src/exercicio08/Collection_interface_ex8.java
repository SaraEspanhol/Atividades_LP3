package exercicio08;


import java.util.ArrayList;
import java.util.Collection;

public class Collection_interface_ex8 {
    public static void main(String[] args) {
        Collection<Integer> numero = new ArrayList<>();
        numero.add(100);
        numero.add(1000);
        numero.add(10000);
        numero.add(100000);
        numero.add(1000000);

        System.out.println("Total de elementos: " + numero.size());  // Exibe o total de elementos
    }
}
