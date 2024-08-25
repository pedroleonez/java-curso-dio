package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {
        if (!contagemPalavrasMap.containsKey(palavra)) {
            contagemPalavrasMap.put(palavra, 1);
        } else {
            contagemPalavrasMap.put(palavra, contagemPalavrasMap.get(palavra) + 1);
        }
    }

    public void removerPalavra(String palavra) {
        if (contagemPalavrasMap.containsKey(palavra)) {
            Integer v = contagemPalavrasMap.get(palavra);
            if (v == 1) {
                contagemPalavrasMap.remove(palavra);
            } else {
                contagemPalavrasMap.put(palavra, v - 1);
            }
        }
    }

    //METODO exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens
    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    //metodo encontrarPalavraMaisFrequente(): Retorna a palavra mais frequente no dicionário
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        if (!contagemPalavrasMap.isEmpty()) {
            int max = 0;
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("pedro");
        contagemPalavras.adicionarPalavra("maria");
        contagemPalavras.adicionarPalavra("maria");
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("pedro");
        contagemPalavras.exibirContagemPalavras();

        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente no dicionário é: " + palavraMaisFrequente);
    }
}
