package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) { // ok
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) { // ok
        Tarefa tarefaParaRemover = null;
        
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
        }
        listaTarefas.remove(tarefaParaRemover);
    }

    public void exibirTarefas() { // ok
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                System.out.println(t);
            }
        }
    }

    public int contarTarefas() { // ok
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() { // ok
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getConcluida().equals(true)) {
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() { // ok
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getConcluida().equals(false)) {
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaComoConcluida(String descricao) { // ok
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao) && t.getConcluida() == false) {
                    t.setConcluida(true);
                }
            }
        }
    }

    public void marcarTarefaComoPendente(String descricao) { // ok
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                }
            }
        }
    }

    public void limparListaTarefa() {
        Set<Tarefa> limparLista = new HashSet<>();

        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                limparLista.add(t);
            }
        }
        listaTarefas.removeAll(limparLista);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.exibirTarefas();

        System.out.println("--------------------");
        // listaTarefas.removerTarefa("Tarefa 1");
        // listaTarefas.exibirTarefas();

        // System.out.println(listaTarefas.contarTarefas());

        // System.out.println("--------------------");

        // System.out.println("--------------------");
        // listaTarefas.marcarTarefaComoConcluida("Tarefa 1");
        // System.out.println(listaTarefas.obterTarefasConcluidas());

        // System.out.println("--------------------");
        // listaTarefas.marcarTarefaComoPendente("Tarefa 1");
        // System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefa();
        listaTarefas.exibirTarefas();
    }
}
