package set.ordenacao;

import java.util.Comparator;

class Produto implements Comparable<Produto>{

    private Long code;
    private String name;
    private Double price;
    private Integer quant;
    
    public Produto(Long code, String name, Double price, Integer quant) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public Long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuant() {
        return quant;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [code=" + code + ", name=" + name + ", price=" + price + ", quant=" + quant + "]";
    }

    @Override
    public int compareTo(Produto p) {
        return name.compareTo(p.getName());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
    
}
