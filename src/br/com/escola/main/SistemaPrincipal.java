package br.com.escola.main;

import br.com.escola.model.Guitarra;
import br.com.escola.model.GuitarraAcustica;
import br.com.escola.model.GuitarraEletrica;
import br.com.escola.model.Guitarrista;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Teste de Herança\n");

        GuitarraEletrica stratocaster = new GuitarraEletrica("Fender", 6, 100);
        GuitarraAcustica violao = new GuitarraAcustica("Yamaha", 6, true);

        
        System.out.println("Testando GuitarraEletrica");
        System.out.println("Marca: " + stratocaster.getMarca() + " | Potência: " + stratocaster.getPotenciaWatts() + "W");
        stratocaster.afinar();
        stratocaster.tocar("Comfortably Numb");

        if (stratocaster.getPotenciaWatts() >= 100) {
            System.out.println("Atenção: guitarra de alta potência, use protetor auricular!");
        }

        System.out.println("\nTestando GuitarraAcustica");
        System.out.println("Marca: " + violao.getMarca() + " | Cutaway: " + violao.isTemCutaway());
        violao.afinar();
        violao.tocar("Blackbird");

        if (violao.isTemCutaway()) {
            System.out.println("Guitarra com cutaway: acesso facilitado às casas mais altas!");
        }

        System.out.println("\nAssociando com Guitarrista");
        // Aqui o guitarrista pode receber qualquer tipo de Guitarra, mãe ou filha
        Guitarrista bento = new Guitarrista("Bento", 20, 3, stratocaster);
        bento.apresentar();
    }
}
