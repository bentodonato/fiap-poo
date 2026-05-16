package br.com.escola.model;

public class GuitarraAcustica extends Guitarra {

    // Esse é o atributo exclusivo, a mãe Guitarra não tem isso
    private boolean temCutaway;

    // Construtor da filha
    public GuitarraAcustica(String marca, int numeroDeCordas, boolean temCutaway) {
        super(marca, numeroDeCordas);
        this.temCutaway = temCutaway;
    }

    public boolean isTemCutaway() {
        return this.temCutaway;
    }
}
