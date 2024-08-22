package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;
    
    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //metodo adicionarItem
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    //metodo removerItem
    public void removerItem(String nome) {
        itemList.removeIf(item -> item.getNome().equals(nome));
    }

    //metodo calcularValorTotal
    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itemList) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total do carrinho: R$ " + total);
        return total;
    }

    //metodo exibirItens
    public void exibirItens() {
        for (Item item : itemList) {
            System.out.println(item.getNome() + " - R$ " + item.getPreco() + " - Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem("Item 1", 10.0, 2);
        carrinho.adicionarItem("Item 2", 20.0, 1);
        carrinho.adicionarItem("Item 3", 5.0, 3);
        
        carrinho.exibirItens();

        carrinho.removerItem("Item 2");
        
        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }
}
