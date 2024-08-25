package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //metodo adicionarProduto(long cod, String nome, int quantidade, double preco)
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //metodo exibirProdutos()
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    //metodo calcularValorTotalEstoque()
    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
            valorTotal += entry.getValue().getPreco() * entry.getValue().getQuantidade();
        }
        return valorTotal;
    }

    //metodo obterProdutoMaisCaro()
    public Produto obterProdutoMaisCaro() {
        Produto maisCaro = null;
        for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
            if (maisCaro == null || entry.getValue().getPreco() > maisCaro.getPreco()) {
                maisCaro = entry.getValue();
            }
        }
        return maisCaro;
    }

    //metodo obterProdutoMaisBarato()
    public Produto obterProdutoMaisBarato() {
        Produto maisBarato = null;
        for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
            if (maisBarato == null || entry.getValue().getPreco() < maisBarato.getPreco()) {
                maisBarato = entry.getValue();
            }
        }
        return maisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        // Adicionar produtos
        estoqueProdutos.adicionarProduto(1, "Mouse", 10, 100.0);
        estoqueProdutos.adicionarProduto(2, "Teclado", 20, 200.0);
        estoqueProdutos.adicionarProduto(3, "Monitor", 30, 300.0);

        // Exibir produtos
        estoqueProdutos.exibirProdutos();
        System.out.println("--------------------------");

        // Calcular valor total do estoque
        double valorTotal = estoqueProdutos.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: " + valorTotal);
        System.out.println("--------------------------");

        // Obter o produto mais caro
        Produto maisCaro = estoqueProdutos.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + maisCaro);
        System.out.println("--------------------------");

        // Obter o produto mais barato
        Produto maisBarato = estoqueProdutos.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + maisBarato);
    }

}
