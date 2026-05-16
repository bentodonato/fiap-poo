package br.com.escola.main;

import br.com.escola.model.Guitarra;
import br.com.escola.model.Guitarrista;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Inicializando Sistema\n");

       
        Guitarra minhaGuitarra = new Guitarra("Fender", 6);
        Guitarra guitarraDoProf = new Guitarra("Gibson", 7);

        // Guitarristas associando cada um à sua Guitarra
        Guitarrista bento = new Guitarrista("Bento", 20, 3, minhaGuitarra);
        Guitarrista professor = new Guitarrista("Professor", 30, 10, guitarraDoProf);

        System.out.println("\nApresentações");
        bento.apresentar();
        System.out.println();
        professor.apresentar();


        System.out.println("\nProva da Referência");
        System.out.println("Guitarra do Bento está afinada? " + bento.getGuitarra().isEstaAfinada());
        minhaGuitarra.afinar();

        System.out.println("Depois de afinar, consultado através do Guitarrista: " + bento.getGuitarra().isEstaAfinada());

        System.out.println("\nNavegando entre objetos");
        System.out.println("Marca da guitarra do professor consultada via Guitarrista: "
                + professor.getGuitarra().getMarca());

        bento.praticar(2);
        bento.praticar(0);
    }
}
