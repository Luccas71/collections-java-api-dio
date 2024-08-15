package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long code, String nome, Double preco, Integer quantidade) {
        estoqueProdutosMap.put(code, new Produto(nome, preco, quantidade));
    }

    public void exebirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public Double calcularValorTotalNoEstoque() {
        double valorTotalNoEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalNoEstoque += p.getValorTotalEmEstoque();
            }
        }
        return valorTotalNoEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }
    public Produto produtoComMaiorValorEmEstoque() {
        Produto produto = null;
        double maiorValorEmEstoque = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getValorTotalEmEstoque() > maiorValorEmEstoque) {
                    produto = p;
                    maiorValorEmEstoque = p.getValorTotalEmEstoque();
                }
            }
        }
        return  produto;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(1L, "Produto 1", 2.56, 5);
        estoqueProduto.adicionarProduto(2L, "Produto 2", 4.59, 12);
        estoqueProduto.adicionarProduto(3L, "Produto 3", 10.0, 2);

        estoqueProduto.exebirProdutos();

        System.out.println("O valor total em estoque é: R$ " + estoqueProduto.calcularValorTotalNoEstoque());

        System.out.println("O produto mais caro é: " + estoqueProduto.obterProdutoMaisCaro());

        System.out.println("O produto mais barato é: " + estoqueProduto.obterProdutoMaisBarato());

        System.out.println("O produto com maior valor no estoque é: " + estoqueProduto.produtoComMaiorValorEmEstoque());
    }
}
