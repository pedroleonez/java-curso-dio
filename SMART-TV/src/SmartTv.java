public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 2;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
    }

    public void aumentarCanal() {
        if (canal < 250) {
            canal++;
        }
    }

    public void diminuirCanal() {
        if (canal > 0) {
            canal--;
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal <= 250 && novoCanal >= 0) {
            canal = novoCanal;
        }
    }
}
