package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirEventos() {
        // LocalDate já extende da interface Comparable e já organiza em ordem crescente
        Map<LocalDate, Evento> eventos = new TreeMap<>(agendaEventos);
        System.out.println(eventos);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventos = new TreeMap<>(agendaEventos);
        for(Map.Entry<LocalDate,Evento> entry : eventos.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento é " +entry.getValue() + "no dia "+ entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 3, 12), "Evento 1", "atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 12), "Evento 1", "atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 3, 12), "Evento 1", "atracao 1");

//        agendaEventos.exibirEventos();

        agendaEventos.obterProximoEvento();
    }
}
