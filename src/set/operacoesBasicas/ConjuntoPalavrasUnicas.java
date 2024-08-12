package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavrasUnicas;
    
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }
    
    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }



    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;

        if (!palavrasUnicas.isEmpty()) {
            for (String p : palavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                }
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    public Boolean verificarPalavra(String palavra) {
        Boolean palavraContidaNoSet = false;

        if (!palavrasUnicas.isEmpty()) {
            for (String p : palavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraContidaNoSet = true;
                }
            }
        }
        return palavraContidaNoSet;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas setConjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        setConjuntoPalavrasUnicas.exibirPalavrasUnicas();

        setConjuntoPalavrasUnicas.adicionarPalavra("Batata");
        setConjuntoPalavrasUnicas.adicionarPalavra("Carro");
        setConjuntoPalavrasUnicas.adicionarPalavra("Lanterna");

        setConjuntoPalavrasUnicas.exibirPalavrasUnicas();

        setConjuntoPalavrasUnicas.removerPalavra("batata");

        setConjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(setConjuntoPalavrasUnicas.verificarPalavra("Lanterna"));

    }

}