package br.com.escola.main;

import br.com.escola.model.Guitarra;
import br.com.escola.model.GuitarraAcustica;
import br.com.escola.model.GuitarraEletrica;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {


        // teste 1: Subclasses funcionam normalmente
        List<Guitarra> colecao = new ArrayList<>();

        colecao.add(new GuitarraEletrica("Fender", 6, 100));
        colecao.add(new GuitarraEletrica("Gibson", 7, 50));
        colecao.add(new GuitarraAcustica("Yamaha", 6, true));
        colecao.add(new GuitarraAcustica("Takamine", 6, false));

        System.out.println("CATÁLOGO DE GUITARRAS\n");

        for (Guitarra guitarra : colecao) {
            System.out.println("Marca: " + guitarra.getMarca());
            guitarra.exibirTipo();
            System.out.println(guitarra.gerarSom());
            System.out.println("-----------------------------------");
        }
    }
}
