package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPalavra(String palavra) {
        return dicionario.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra1", "definição 1");
        dicionario.adicionarPalavra("palavra2", "definição 2");
        dicionario.adicionarPalavra("palavra3", "definição 3");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("palavra2");

        dicionario.exibirPalavras();

//        System.out.println(dicionario.pesquisarPalavra("palavra1"));
    }
}
