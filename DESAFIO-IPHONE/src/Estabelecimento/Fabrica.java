package Estabelecimento;

import Perifericos.Aparelho_Telefonico.Aparelho_Telefonico;
import Perifericos.Aparelho_Telefonico.Telefone_App;
import Perifericos.Navegador_Internet.Navegador_Internet;
import Perifericos.Navegador_Internet.Safari;
import Perifericos.ReprodutorMusical.Apple_Music;
import Perifericos.ReprodutorMusical.Reprodutor_Musical;
import Perifericos.Smartphone.IPhone;

public class Fabrica {
    public static void main(String[] args) {
        
        Aparelho_Telefonico aparelho = new Telefone_App();
        aparelho.ligar("123456789");

        System.out.println("-------------------------");

        Navegador_Internet navegador = new Safari();
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        System.out.println("-------------------------");

        Reprodutor_Musical reprodutor = new Apple_Music();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionar_musica("'new years day'");

        System.out.println("-------------------------");

        IPhone iphone = new IPhone();
        
        Aparelho_Telefonico aparelho_telefonico = iphone;
        Navegador_Internet navegador_internet = iphone;
        Reprodutor_Musical reprodutor_musical = iphone;

        aparelho_telefonico.ligar("123456789");
        aparelho_telefonico.atender();
        aparelho_telefonico.iniciarCorreioVoz();

        System.out.println("-------------------------");

        navegador_internet.exibirPagina("www.google.com");
        navegador_internet.adicionarNovaAba();
        navegador_internet.atualizarPagina();

        System.out.println("-------------------------");

        reprodutor_musical.tocar();
        reprodutor_musical.pausar();
        reprodutor_musical.selecionar_musica("'new years day'");
    }
}
