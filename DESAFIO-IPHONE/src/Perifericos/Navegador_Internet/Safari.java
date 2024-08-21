package Perifericos.Navegador_Internet;

public class Safari implements Navegador_Internet{
    @Override 
    public void exibirPagina(String url) {
        System.out.println("exibindo " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("atualizando a pagina");
    }
}
