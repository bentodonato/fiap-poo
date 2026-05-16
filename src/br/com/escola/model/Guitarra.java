package br.com.escola.model;

public class Guitarra {

    // Atributos agora estão privados
    private String marca;
    private int numeroDeCordas;
    private boolean estaAfinada;

    // Construtor
    public Guitarra(String marca, int numeroDeCordas) {
        this.setMarca(marca);
        this.setNumeroDeCordas(numeroDeCordas);
        this.setEstaAfinada(false); // Toda guitarra vai começa desafinada
    }

    // Métodos de comportamento
    public void afinar() {
        this.setEstaAfinada(true);
        System.out.println(this.getMarca() + " foi afinada com sucesso!");
    }

    public void tocar(String musica) {
        if (this.isEstaAfinada() == false) {
            System.out.println("Erro: a guitarra " + this.getMarca() + " não está afinada. Afine antes de tocar.");
            return;
        }
        System.out.println(this.getMarca() + " está tocando: " + musica);
    }

    public void trocarCordas(int novoNumero) {
        if (novoNumero != 6 && novoNumero != 7) {
            System.out.println("Erro: número de cordas inválido. Use 6 ou 7.");
            return;
        }
        this.setNumeroDeCordas(novoNumero);
        this.setEstaAfinada(false);
        System.out.println(this.getMarca() + " agora tem " + this.getNumeroDeCordas() + " cordas. Lembre-se de afinar!");
    }

    // Getters (públicos)
    public String getMarca() {
        return this.marca;
    }

    public int getNumeroDeCordas() {
        return this.numeroDeCordas;
    }

    public boolean isEstaAfinada() {
        return this.estaAfinada;
    }

    // Setters (privados - vai ser controlado pelos métodos da classe)
    private void setMarca(String marca) {
        this.marca = marca;
    }

    private void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    private void setEstaAfinada(boolean estaAfinada) {
        this.estaAfinada = estaAfinada;
    }
}

