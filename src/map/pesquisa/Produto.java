package map.pesquisa;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Double valorTotalEmEstoque;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorTotalEmEstoque = preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValorTotalEmEstoque() {
        return valorTotalEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", valor total em estoque =" + valorTotalEmEstoque +
                '}';
    }
}
