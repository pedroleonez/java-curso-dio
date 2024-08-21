package Perifericos.ReprodutorMusical;

public class Apple_Music implements Reprodutor_Musical{

    @Override
    public void tocar() {
        System.out.println("tocando");
    }

    @Override
    public void pausar() {
        System.out.println("pausando");
    }

    @Override
    public void selecionar_musica(String musica) {
        System.out.println("selecionando "+ musica);
    }
}
