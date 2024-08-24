package main.java.set.Ordenacao;

public class Produto implements Comparable<Produto> {

    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //toString
    @Override
    public String toString() {
        return "Cod: " + cod + ", Nome: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade;
    }

    //comparator preço
    @Override
    public int compareTo(Produto p) {
        if (p == null) {
            throw new NullPointerException("Produto nulo.");
        }
        return Double.compare(this.getPreco(), p.getPreco());
    }
}
