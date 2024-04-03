package Exercicio_07;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Compromisso c1 = new Compromisso(LocalDate.of(2024, 2, 2), "22:00", "Comprimisso 02");
        Compromisso c2 = new Compromisso(LocalDate.of(2024, 3, 3), "09:00", "Comprimisso 01");
        Compromisso c3 = new Compromisso(LocalDate.of(2024, 4, 4), "10:10", "Comprimisso 03");

        agenda.adicionarCompromisso(c1);
        agenda.adicionarCompromisso(c2);
        agenda.adicionarCompromisso(c3);

        LocalDate dataBusca = LocalDate.of(2024, 4, 4);
        List<Compromisso> compromissosEncontrados = agenda.obterCompromissosPorData(dataBusca);

        System.out.println("Compromissos para " + dataBusca + ":");
        for (Compromisso compromisso : compromissosEncontrados) {
            System.out.println("Hora: " + compromisso.getHora() + ", Descrição: " + compromisso.getDescricao());
        }
    }
}