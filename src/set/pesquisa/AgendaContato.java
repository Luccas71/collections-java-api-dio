package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    
    private Set<Contato> setContato;

    public AgendaContato() {
        this.setContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        setContato.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(setContato);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> listaContatos = new HashSet<>();

        if (!setContato.isEmpty()) {
            for (Contato c : setContato) {
                if (c.getNome().contains(nome)) {
                    listaContatos.add(c);
                }
            }
        }
        
        return listaContatos;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        if (!setContato.isEmpty()) {
            for (Contato c : setContato) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();
        
        agendaContato.adicionarContato("Andre Lucas", 123456);
        agendaContato.adicionarContato("Lucas", 123456);
        agendaContato.adicionarContato("Joao", 123487);
        agendaContato.adicionarContato("Carlos", 123487);
        agendaContato.adicionarContato("Lucas Antonio", 123895);
        agendaContato.adicionarContato("Flaco", 123456);

        agendaContato.exibirContatos();
        
        //System.out.println( agendaContato.pesquisarPorNome("Lucas"));
        
        System.out.println(agendaContato.atualizarNumeroContato("Lucas", 456123));

        agendaContato.exibirContatos();
    }
}
