package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //metodo adicionarTarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //metodo removerTarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //metodo obterNumeroTotalTarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    //metodo obterDescricoesTarefas
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
