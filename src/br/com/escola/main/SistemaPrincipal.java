package br.com.escola.main;

import br.com.escola.model.Guitarra;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Iniciando o Sistema Guitarra\n");

        // Construtor agora vai exigir a marca e numero_de_cordas
        Guitarra minhaGuitarra = new Guitarra("Fender", 6);
        Guitarra guitarraDoProfessor = new Guitarra("Gibson", 7);

        System.out.println("Teste: tocar sem afinar");
        minhaGuitarra.tocar("Bohemian Rhapsody");

        System.out.println("\nTeste: afinar e tocar");
        minhaGuitarra.afinar();
        minhaGuitarra.tocar("Bohemian Rhapsody");

        System.out.println("\nTeste: trocar cordas com valor inválido");
        guitarraDoProfessor.trocarCordas(12);

        System.out.println("\nTeste: trocar cordas com valor válido");
        guitarraDoProfessor.trocarCordas(6);

        System.out.println("\nTeste: tocar após trocar cordas sem afinar");
        guitarraDoProfessor.tocar("Stairway to Heaven");

        System.out.println("\nStatus final das guitarras");
        // Agora usamos getters para ler os atributos
        System.out.println("Guitarra: " + minhaGuitarra.getMarca() + " | Cordas: " + minhaGuitarra.getNumeroDeCordas() + " | Afinada: " + minhaGuitarra.isEstaAfinada());
        System.out.println("Guitarra: " + guitarraDoProfessor.getMarca() + " | Cordas: " + guitarraDoProfessor.getNumeroDeCordas() + " | Afinada: " + guitarraDoProfessor.isEstaAfinada());

    }
}
