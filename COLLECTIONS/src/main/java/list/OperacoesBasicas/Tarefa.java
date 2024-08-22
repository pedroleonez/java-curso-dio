package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //get 
    public String getDescricao() {
        return descricao;
    }

    //toString
    public String toString() {
        return descricao;
    }
}
