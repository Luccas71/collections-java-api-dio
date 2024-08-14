package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer contato = null;

        if (!agendaContatoMap.isEmpty()) {
            contato = agendaContatoMap.get(nome);
        }
        return contato;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Lucas", 123);
        agendaContatos.adicionarContato("Lucas", 122);
        agendaContatos.adicionarContato("Rodrigo", 133);
        agendaContatos.adicionarContato("Carlos", 113);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Carlos"));;

        agendaContatos.removerContato("Rodrigo");
        agendaContatos.exibirContatos();
    }
}
