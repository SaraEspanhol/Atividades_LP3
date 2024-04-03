package Exercicio_07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Compromisso {
    private LocalDate data;
    private String hora;
    private String descricao;

    public Compromisso(LocalDate data, String hora, String descricao) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getDescricao() {
        return descricao;
    }
}

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    public List<Compromisso> obterCompromissosPorData(LocalDate data) {
        List<Compromisso> compromissosNaData = new ArrayList<>();
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getData().equals(data)) {
                compromissosNaData.add(compromisso);
            }
        }
        return compromissosNaData;
    }

}

