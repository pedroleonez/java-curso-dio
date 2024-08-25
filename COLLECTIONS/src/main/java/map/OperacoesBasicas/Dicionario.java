package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private final Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    //metodo adicionarPalavra(String palavra, String definicao)
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    //metodo removerPalavra(String palavra)
    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    //metodo exibirPalavras()
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    //metodo pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente
    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;
        if (!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.get(palavra);
        }
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        // Adicionar palavras
        dicionario.adicionarPalavra("cachorro", "animal");
        dicionario.adicionarPalavra("gato", "animal");
        dicionario.adicionarPalavra("pato", "animal");

        dicionario.exibirPalavras();

        System.out.println("---------------------------");

        // Remover palavras
        dicionario.removerPalavra("pato");
        dicionario.exibirPalavras();

        System.out.println("---------------------------");

        // Remover palavras
        dicionario.removerPalavra("cachorro");
        dicionario.exibirPalavras();

        System.out.println("---------------------------");

        // Pesquisar palavras
        String palavraPesquisa = "gato";
        String definicao = dicionario.pesquisarPorPalavra(palavraPesquisa);
        System.out.println("Definição de " + palavraPesquisa + ": " + definicao);
    }
}
