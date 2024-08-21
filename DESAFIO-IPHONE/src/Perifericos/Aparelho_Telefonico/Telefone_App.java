package Perifericos.Aparelho_Telefonico;

public class Telefone_App implements Aparelho_Telefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }
}
