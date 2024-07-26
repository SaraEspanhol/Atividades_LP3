package exercicio_12;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {

    private String nome;
    private List<Object> conteudo;

    public Diretorio(String nome) {
        this.nome = nome;
        this.conteudo = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionar(Object item) {
        conteudo.add(item);
    }

    public int calcularTamanhoTotal() {
        int total = 0;
        for (Object item : conteudo) {
            if (item instanceof Arquivo) {
                total += ((Arquivo) item).getTamanho();
            } else if (item instanceof Diretorio) {
                total += ((Diretorio) item).calcularTamanhoTotal();
            }
        }
        return total;
    }

	public List<Object> getConteudo() {
		return conteudo;
	}
}
