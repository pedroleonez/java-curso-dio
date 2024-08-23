package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    
    private List<Numero> numList;

    public OrdenacaoNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numList.add(new Numero(numero));
    }

    //ordenar ascendente
    public void ordenarAscendente() {
        Collections.sort(this.numList);
        System.out.println(this.numList);
    }

    //ordenar descendente
    public void ordenarDescendente() {
        Collections.sort(this.numList, Collections.reverseOrder());
        System.out.println(this.numList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.ordenarAscendente();
        ordenacaoNumeros.ordenarDescendente();
    }

}
