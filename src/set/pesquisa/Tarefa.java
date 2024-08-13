package set.pesquisa;

public class Tarefa {
    
    private String descricao;
    private Boolean concluida;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
    }

    
}
