package br.com.escola.main;

import br.com.escola.model.Guitarra;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instância 1 - Minha Guitarra
        Guitarra minhaGuitarra = new Guitarra();
        minhaGuitarra.marca = "Fender";
        minhaGuitarra.numeroDeCordas = 6;
        minhaGuitarra.estaAfinada = true;

        // Instância 2 - Guitarra do Professor
        Guitarra guitarraDoProfessor = new Guitarra();
        guitarraDoProfessor.marca = "Gibson";
        guitarraDoProfessor.numeroDeCordas = 7;
        guitarraDoProfessor.estaAfinada = false;

        System.out.println("Minha guitarra é: " + minhaGuitarra.marca);
        System.out.println("A do professor é: " + guitarraDoProfessor.marca);
    }

}
