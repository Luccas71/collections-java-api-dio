package list.odenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoa() {
        this.listPessoas = new ArrayList<>();
    }

    public List<Pessoa> getListPessoas() {
        return listPessoas;
    }

    public void criarPessoa(String nome, int idade, double altura) {
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPessoa());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa listaDePessoas = new OrdenacaoPessoa();

        listaDePessoas.criarPessoa("Nome 1", 12, 1.56);
        listaDePessoas.criarPessoa("Nome 2", 16, 1.59);
        listaDePessoas.criarPessoa("Nome 3", 19, 1.72);
        listaDePessoas.criarPessoa("Nome 4", 21, 1.80);

        // System.out.println(listaDePessoas.getListPessoas());

        // System.out.println(listaDePessoas.ordenarPorAltura());

        System.out.println(listaDePessoas.ordenarPorIdade());
    }
}
