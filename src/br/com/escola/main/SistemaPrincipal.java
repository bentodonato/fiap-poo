package br.com.escola.main;

import br.com.escola.model.Avaliavel;
import br.com.escola.model.GuitarraAcustica;
import br.com.escola.model.GuitarraEletrica;
import br.com.escola.model.Guitarrista;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Sistema de Avaliação Musical\n");

        GuitarraEletrica stratocaster = new GuitarraEletrica("Fender", 6, 100);
        GuitarraAcustica violao = new GuitarraAcustica("Yamaha", 6, true);
        Guitarrista bento = new Guitarrista("Bento", 20, 3, stratocaster);
        Guitarrista professor = new Guitarrista("Professor", 45, 20, violao);

        Avaliavel[] avaliados = new Avaliavel[] {
            stratocaster,
            violao,
            bento,
            professor
        };

        System.out.println("\nRelatório de Avaliações\n");

        for (Avaliavel avaliavel : avaliados) {
            avaliavel.exibirAvaliacao();
        }

        System.out.println("\nVerificando tipos");
        System.out.println("Stratocaster é Avaliavel? " + (stratocaster instanceof Avaliavel));
        System.out.println("Bento é Avaliavel? " + (bento instanceof Avaliavel));
        System.out.println("Violão é Avaliavel? " + (violao instanceof Avaliavel));
    }
}
