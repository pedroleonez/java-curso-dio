package main.java.set.OperacoesBasicas;

public class Palavra {

    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return this.palavra;
    }
}
