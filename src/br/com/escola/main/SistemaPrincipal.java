package br.com.escola.main;

import br.com.escola.model.Guitarra;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instância 1 - Minha Guitarra
        Guitarra minhaGuitarra = new Guitarra("Fender", 6);

        // Instância 2 - Guitarra do Professor
        Guitarra guitarraDoProfessor = new Guitarra("Gibson", 7);

        System.out.println("Teste: tocar sem afinar (valor inválido)");
        minhaGuitarra.tocar("Bohemian Rhapsody");

        System.out.println("Teste: afinar e tocar (valor válido)");
        minhaGuitarra.afinar();
        minhaGuitarra.tocar("Bohemian Rhapsody");

        System.out.println("Teste: trocar cordas com valor inválido");
        guitarraDoProfessor.trocarCordas(12);

        System.out.println("Teste: trocar cordas com valor válido");
        guitarraDoProfessor.trocarCordas(6);

        System.out.println("Teste: tocar após trocar cordas sem afinar");
        guitarraDoProfessor.tocar("Stairway to Heaven");

        System.out.println("Estado final das guitarras");
        System.out.println("Guitarra: " + minhaGuitarra.marca + " - Cordas: " + minhaGuitarra.numeroDeCordas + " - Afinada: " + minhaGuitarra.estaAfinada);
        System.out.println("Guitarra: " + guitarraDoProfessor.marca + " - Cordas: " + guitarraDoProfessor.numeroDeCordas + " - Afinada: " + guitarraDoProfessor.estaAfinada);
    }
}