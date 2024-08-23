package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //metodo adicionarConvidado(String nome, int codigoConvite)
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //metodo removerConvidadoPorCodigoConvite(int codigoConvite)
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        convidadoSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    //metodo contarConvidados()
    public int contarConvidados() {
        return convidadoSet.size();
    }

    //metodo exibirConvidados()
    public void exibirConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Pedro", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("Joaquim", 2);
        conjuntoConvidados.adicionarConvidado("Ana", 4);
        conjuntoConvidados.exibirConvidados();
        // conjuntoConvidados.removerConvidadoPorCodigoConvite(2);
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
