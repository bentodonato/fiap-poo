package br.com.escola.model;

public class GuitarraAcustica extends Guitarra {

    private boolean temCutaway;

    public GuitarraAcustica(String marca, int numeroDeCordas, boolean temCutaway) {
        super(marca, numeroDeCordas);
        this.temCutaway = temCutaway;
    }

    public boolean isTemCutaway() {
        return this.temCutaway;
    }

    @Override
    public String gerarSom() {
        return "Som acústico natural e encorpado: PLING! Sem amplificador necessário!";
    }
}
