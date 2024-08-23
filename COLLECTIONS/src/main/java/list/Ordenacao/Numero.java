package main.java.list.Ordenacao;

public class Numero implements Comparable<Numero> {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numero outroNumero) {
        return Integer.compare(this.numero, outroNumero.getNumero());
    }

    @Override
    public String toString() {
        return String.valueOf(this.numero);
    }
}
