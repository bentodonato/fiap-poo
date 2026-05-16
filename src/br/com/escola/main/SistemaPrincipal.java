package br.com.escola.main;

import br.com.escola.model.Guitarra;
import br.com.escola.model.Guitarrista;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Testando Guitarra\n");

        Guitarra minhaGuitarra = new Guitarra("Fender", 6);
        Guitarra guitarraDoProfessor = new Guitarra("Gibson", 7);

        minhaGuitarra.afinar();
        minhaGuitarra.tocar("Bohemian Rhapsody");
        guitarraDoProfessor.trocarCordas(6);

        System.out.println("\nTestando Guitarrista\n");

        Guitarrista guitarrista1 = new Guitarrista("Bento", 20, 3);
        Guitarrista guitarrista2 = new Guitarrista("Professor", 30, 10);

        guitarrista1.apresentar();
        guitarrista1.praticar(2);

        guitarrista2.apresentar();
        guitarrista2.praticar(0);

        System.out.println("\nStatus Final\n");
        System.out.println("Guitarra: " + minhaGuitarra.getMarca() + " | Cordas: " + minhaGuitarra.getNumeroDeCordas() + " | Afinada: " + minhaGuitarra.isEstaAfinada());
        System.out.println("Guitarrista: " + guitarrista1.getNome() + " | Idade: " + guitarrista1.getIdade() + " | Experiência: " + guitarrista1.getAnosDeExperiencia() + " anos");
    }
}
