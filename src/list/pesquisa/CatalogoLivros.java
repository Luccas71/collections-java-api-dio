package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> listLivro;

    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> buscarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!listLivro.isEmpty()) {
            for(Livro l : listLivro) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(l);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> buscarLivrosPorIntervaloDePublicacao(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDePublicacao = new ArrayList<>();

        if(!listLivro.isEmpty()) {
            for (Livro livro : listLivro) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDePublicacao.add(livro);
                }
            }
        }
        
        return livrosPorIntervaloDePublicacao;
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        Livro livro = null;

        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                livro = l;
                break;
            }
        }
        return livro;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.buscarLivrosPorAutor("Autor 2"));
        System.out.println(catalogoLivros.buscarLivrosPorIntervaloDePublicacao(1994, 2021));
        System.out.println(catalogoLivros.buscarLivroPorTitulo("Livro 1"));
    }
}
