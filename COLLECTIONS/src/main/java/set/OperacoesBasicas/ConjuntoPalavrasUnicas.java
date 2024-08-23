package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    //metodo adicionarPalavra(String palavra)
    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    //metodo removerPalavra(String palavra)
    public void removerPalavra(String palavra) {
        palavrasSet.remove(palavra);
    }

    //metodo verificarPalavra(String palavra)
    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    //metodo exibirPalavrasUnicas() - Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Pedro");
        conjuntoPalavrasUnicas.adicionarPalavra("Pedro");
        conjuntoPalavrasUnicas.adicionarPalavra("Joaquim");
        conjuntoPalavrasUnicas.adicionarPalavra("Ana");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
    
}
