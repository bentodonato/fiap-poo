package br.com.escola.main;

import br.com.escola.model.Guitarra;
import br.com.escola.model.GuitarraAcustica;
import br.com.escola.model.GuitarraEletrica;
import br.com.escola.model.Guitarrista;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {

        List<Guitarra> colecao = new ArrayList<>();

        colecao.add(new GuitarraEletrica("Fender", 6, 100));
        colecao.add(new GuitarraEletrica("Gibson", 7, 50));
        colecao.add(new GuitarraAcustica("Yamaha", 6, true));
        colecao.add(new GuitarraAcustica("Takamine", 6, false));

        System.out.println("RELATÓRIO DE SONS DA COLEÇÃO\n");

        for (Guitarra guitarra : colecao) {
            System.out.println("Guitarra: " + guitarra.getMarca());
            guitarra.afinar();
            System.out.println(guitarra.gerarSom());
            System.out.println("---------------------------------------");
        }

        System.out.println("\nAssociando com Guitarrista");
        // Guitarrista vai aceitar qualquer tipo de Guitarra: mãe ou filha
        Guitarrista bento = new Guitarrista("Bento", 20, 3, new GuitarraEletrica("Fender", 6, 100));
        bento.apresentar();
        System.out.println(bento.getGuitarra().gerarSom());
    }
}
