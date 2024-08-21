package Perifericos.Smartphone;

import Perifericos.Aparelho_Telefonico.Aparelho_Telefonico;
import Perifericos.Navegador_Internet.Navegador_Internet;
import Perifericos.ReprodutorMusical.Reprodutor_Musical;

public class IPhone implements Aparelho_Telefonico, Navegador_Internet, Reprodutor_Musical {
    @Override
    public void tocar() {
        System.out.println("tocando via iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("pausando via iPhone");
    }

    @Override
    public void selecionar_musica(String musica) {
        System.out.println("selecionando " + musica + " via iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo " + url + " via iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba via iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando a pagina via iPhone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero + " via iPhone");
    }

    @Override
    public void atender() {
        System.out.println("atendendo via iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz via iPhone");
    }
}
