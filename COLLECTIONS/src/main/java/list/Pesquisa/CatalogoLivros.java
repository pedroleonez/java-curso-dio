package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    // atributo
    private List<Livro> livrosList;

    // construtor
    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    // metodo adicionarLivro
    public void adicionarLivro(String nome, String autor, int anoPublicacao) {
        livrosList.add(new Livro(nome, autor, anoPublicacao));
    }

    // metodo pesquisarPorAutor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    // metodo pesquisarPorIntervaloAnos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    // metodo pesquisarPorTitulo e retorna primeiro encontrado
    public Livro pesquisarPorTitulo(String nome) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getNome().equalsIgnoreCase(nome)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        // criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // adicionando livros
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2020));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));
    }
}
