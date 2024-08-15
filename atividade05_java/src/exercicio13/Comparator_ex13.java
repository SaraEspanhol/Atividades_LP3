package exercicio13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Produto implements Comparable<Produto> {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);  // Compara os preços para ordenar
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

class NomeComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.nome.compareTo(p2.nome);  // Compara os nomes para ordenar
    }
}

public class Comparator_ex13 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Lápis", 2.00));
        produtos.add(new Produto("Lapiseira", 30.00));
        produtos.add(new Produto("Lápis de Cor", 70.00));

        Collections.sort(produtos);  // Ordena por preço
        System.out.println("Produtos ordenados por preço: " + produtos);

        Collections.sort(produtos, new NomeComparator());  // Ordena por nome
        System.out.println("Produtos ordenados por nome: " + produtos);
    }
}
