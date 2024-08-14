package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciadorAlunos;

    public GerenciadorAlunos() {
        this.gerenciadorAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        gerenciadorAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula) {
        Aluno alunoParaRemover = null;

        if (!gerenciadorAlunos.isEmpty()) {
            for (Aluno a : gerenciadorAlunos) {
                if (a.getMatricula().equals(matricula)) {
                    alunoParaRemover = a;
                }
            }
        }
        gerenciadorAlunos.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunoPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(gerenciadorAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMedia() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorMedia());
        alunosPorMedia.addAll(gerenciadorAlunos);
        return alunosPorMedia;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Lucas", 123, 4.8);
        gerenciadorAlunos.adicionarAluno("Caio", 133, 7.8);
        gerenciadorAlunos.adicionarAluno("Augusto", 122, 3.8);

//        System.out.println(gerenciadorAlunos.exibirAlunoPorNome());

//        gerenciadorAlunos.removerAluno(122);
//        System.out.println(gerenciadorAlunos.exibirAlunoPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorMedia());
    }
}
