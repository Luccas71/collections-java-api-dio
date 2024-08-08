package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listaParaRemover = new ArrayList<>();

        //for para identificar elementos repetidos
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listaParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(listaParaRemover);
    }

    public int totalTarefas() {
        return listaTarefa.size();
    }

    public void retornarTodasDescricoes() {
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        System.out.println("total de tarefas: " + lista.totalTarefas());

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");

        System.out.println("total de tarefas: " + lista.totalTarefas());

        lista.removerTarefa("Tarefa 2");
        System.out.println("total de tarefas: " + lista.totalTarefas());

        lista.retornarTodasDescricoes();
    }
}
