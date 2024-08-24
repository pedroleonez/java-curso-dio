package main.java.set.Ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    //metodo adicionarAluno(String nome, Long matricula, double media)
    public void adicionarAluno(String nome, Long matricula, double media) {
        this.alunosSet.add(new Aluno(nome, matricula, media));
    }
    
    //metodo removerAluno(long matricula)
    public void removerAluno(long matricula) {
        this.alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    //metodo exibirAlunosPorNome() = exibe todos os alunos do cadastro em ordem alfabética pelo nome
    public void exibirAlunosPorNome() {
        Set<Aluno> alunosOrdenados = new TreeSet<>(Comparator.comparing(Aluno::getNome));
        alunosOrdenados.addAll(this.alunosSet);
        alunosOrdenados.forEach(aluno -> System.out.println(aluno.getNome()));
    }

    //metodo exibirAlunosPorNota() = exibe todos os alunos do cadastro em ordem crescente de nota
    public void exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenados = new TreeSet<>(Comparator.comparingDouble(Aluno::getMedia));
        alunosOrdenados.addAll(this.alunosSet);
        alunosOrdenados.forEach(aluno -> System.out.println(aluno.getMedia()));
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Pedro", (long) 123456789, 9.5);
        gerenciadorAlunos.adicionarAluno("Ana", (long) 987654321, 8.0);
        gerenciadorAlunos.adicionarAluno("Maria", (long) 456789123, 7.5);
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("----------------------------");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
    
}
