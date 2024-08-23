package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoas {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //metodo ordenarPorIdade
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        System.out.println(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //metodo ordenarPorAltura com comparator
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
        System.out.println(pessoasPorAltura);
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        
        pessoas.adicionarPessoa("Pedro", 25, 1.75);
        pessoas.adicionarPessoa("Maria", 30, 1.65);
        pessoas.adicionarPessoa("João", 20, 1.80);
        pessoas.adicionarPessoa("Ana", 35, 1.70);
        pessoas.adicionarPessoa("Lucas", 40, 1.85);
        pessoas.adicionarPessoa("Julia", 28, 1.72);
        
        pessoas.ordenarPorIdade();

        System.out.println("-------------------");
        
        pessoas.ordenarPorAltura();
    }
}
