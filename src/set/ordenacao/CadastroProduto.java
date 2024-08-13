package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    
    private Set<Produto> catalogoProdutos;

    public CadastroProduto () {
        this.catalogoProdutos = new HashSet<>();
    }

    public void adicionarProduto(long code, String name, double price, int quant) {
        catalogoProdutos.add(new Produto(code, name, price, quant));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(catalogoProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(catalogoProdutos);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Caneta", 1.2, 20);
        cadastroProduto.adicionarProduto(1L, "Lápis", 1.5, 45);
        cadastroProduto.adicionarProduto(2L, "Borracha", 2.0, 23);
        cadastroProduto.adicionarProduto(3L, "Régua", 5.3, 12);

        System.out.println(cadastroProduto.exibirProdutoPorNome());

        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }
}

