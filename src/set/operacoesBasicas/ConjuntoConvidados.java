package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidado(int codigoConvidado) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvidado() == codigoConvidado) {
                convidadoParaRemover = c;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        
    }
}
