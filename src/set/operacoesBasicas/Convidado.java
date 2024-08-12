package set.operacoesBasicas;

public class Convidado {
    
    private String nome;
    private int codigoConvidado;
    
    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvidado=" + codigoConvidado + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvidado;
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
        Convidado other = (Convidado) obj;
        if (codigoConvidado != other.codigoConvidado)
            return false;
        return true;
    }

    
}
