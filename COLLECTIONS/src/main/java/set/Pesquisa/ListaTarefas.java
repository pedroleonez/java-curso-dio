package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    //metodo adicionarTarefa(String descricao)
    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    //metodo removerTarefa(String descricao)
    public void removerTarefa(String descricao) {
        tarefasSet.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    //metodo exibirTarefas()
    public void exibirTarefas() {
        for (Tarefa tarefa : tarefasSet) {
            System.out.println(tarefa.getDescricao());
        }
    }

    //metodo contarTarefas()
    public int contarTarefas() {
        return tarefasSet.size();
    }

    //metodo marcarTarefaConcluida(String descricao)
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    //metodo obterTarefasConcluidas()
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    //metodo obterTarefasPendentes()
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    //metodo marcarTarefaPendente(String descricao)
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }

    //metodo limparListaTarefas()
    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.exibirTarefas();
        System.out.println("--------------------------------");
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        System.out.println("--------------------------------");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.exibirTarefas();
        System.out.println("--------------------------------");
        System.out.println("Quantidade de tarefas concluídas: " + listaTarefas.obterTarefasConcluidas().size());
        System.out.println("--------------------------------");
        System.out.println("Quantidade de tarefas pendentes: " + listaTarefas.obterTarefasPendentes().size());
        System.out.println("--------------------------------");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
