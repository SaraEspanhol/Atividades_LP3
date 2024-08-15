package exercicio12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Interator_ex12 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(20);
        numeros.add(200);
        numeros.add(20000);
        numeros.add(200000);
        numeros.add(2000000);

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // Exibe cada número
        }
    }
}

