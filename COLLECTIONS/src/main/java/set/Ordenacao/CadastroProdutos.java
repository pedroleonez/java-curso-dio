package main.java.set.Ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;


public class CadastroProdutos {
    
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    //metodo adicionarProduto(long cod, String nome, double preco, int quantidade)
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    //metodo exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome
    public void exibirProdutosPorNome() {
        Set<Produto> produtosOrdenados = new TreeSet<>(Comparator.comparing(Produto::getNome));
        produtosOrdenados.addAll(this.produtosSet);
        for (Produto p : produtosOrdenados) {
            System.out.println(p.toString());
        }
    }

    //metodo exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço
    public void exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenados = new TreeSet<>(Comparator.comparingDouble(Produto::getPreco));
        produtosOrdenados.addAll(this.produtosSet);
        for (Produto p : produtosOrdenados) {
            System.out.println(p.toString());
        }
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Mouse", 900.0, 10);
        cadastroProdutos.adicionarProduto(2, "Teclado", 450.0, 20);
        cadastroProdutos.adicionarProduto(3, "Monitor", 700.0, 30);
        cadastroProdutos.exibirProdutosPorNome();
        System.out.println("-----------------------");
        cadastroProdutos.exibirProdutosPorPreco();
    }
}
