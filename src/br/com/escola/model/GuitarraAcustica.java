package br.com.escola.model;

public class GuitarraAcustica extends Guitarra implements Avaliavel {

    private boolean temCutaway;

    public GuitarraAcustica(String marca, int numeroDeCordas, boolean temCutaway) {
        super(marca, numeroDeCordas);
        this.temCutaway = temCutaway;
    }

    public boolean isTemCutaway() { return this.temCutaway; }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Guitarra Acústica | Cutaway: " + this.temCutaway + " | Estilo: Folk e MPB");
    }

    @Override
    public String gerarSom() {
        return "Som acústico natural e encorpado: PLING!";
    }

    @Override
    public double calcularNota() {
        if (this.temCutaway) return 9.0;
        return 7.0;
    }

    @Override
    public void exibirAvaliacao() {
        System.out.println("Avaliação | " + this.getMarca() + " (Acústica) | Nota: " + this.calcularNota());
    }
}
