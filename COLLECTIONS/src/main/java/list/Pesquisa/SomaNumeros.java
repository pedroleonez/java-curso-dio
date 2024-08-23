package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    //atributo
    private List<Numero> numList;

    //construtor
    public SomaNumeros() {
        this.numList = new ArrayList<>();
    }

    //metodo adicionarNumero
    public void adicionarNumero(int numero) {
        this.numList.add(new Numero(numero));
    }

    //metodo calcularSomar
    public int calcularSomar() {
        int soma = 0;
        for (Numero n : numList) {
            soma += n.getNumero();
        }
        return soma;
    }

    //metodo encontrarMaiorNumero
    public int encontrarMaiorNumero() {
        int maior = 0;
        for (Numero n : numList) {
            if (n.getNumero() > maior) {
                maior = n.getNumero();
            }
        }
        return maior;
    }

    //metodo encontrarMenorNumero
    public int encontrarMenorNumero() {
        int menor = numList.get(0).getNumero();
        for (Numero n : numList) {
            if (n.getNumero() < menor) {
                menor = n.getNumero();
            }
        }
        return menor;
    }

    //metodo exibirNumeros
    public void exibirNumeros() {
        for (Numero n : numList) {
            System.out.println(n.getNumero());
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        System.out.println("Soma: " + somaNumeros.calcularSomar());
        System.out.println("Maior n\u00FAmero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor n\u00FAmero: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
