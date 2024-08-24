package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    
    private Set<Contato> contatosSet;
    
    public AgendaContatos() {
        contatosSet = new HashSet<>();
    }

    //metodo adicionarContato(String nome, int numero)
    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    //metodo exibirContatos()
    public void exibirContatos() {
        for (Contato contato : contatosSet) {
            System.out.println(contato);
        }
    }

    //metodo pesquisarPorNome(String nome)
    public void pesquisarPorNome(String nome) {
        Contato contato = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equals(nome)) {
                contato = c;
                break;
            }
        }
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato nao encontrado.");
        }
    }

    //metodo atualizarNumeroContato(String nome, int novoNumero)
    public void atualizarNumeroContato(String nome, int novoNumero) {
        Contato contato = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equals(nome)) {
                contato = c;
                break;
            }
        }
        if (contato != null) {
            contato.setNumero(novoNumero);
            System.out.println("Numero do contato atualizado: " + contato);
        } else {
            System.out.println("Contato nao encontrado.");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Pedro", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.exibirContatos();
        agenda.pesquisarPorNome("Pedro");
        agenda.atualizarNumeroContato("Pedro", 987654321);
    }
    
}
