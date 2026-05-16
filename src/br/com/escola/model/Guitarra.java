package br.com.escola.model;

// 'abstract' da Guitarra agora é um molde
public abstract class Guitarra {

    private String marca;
    private int numeroDeCordas;
    private boolean estaAfinada;

    // Construtor ainda existe: é chamado pelas filhas via super()
    public Guitarra(String marca, int numeroDeCordas) {
        this.setMarca(marca);
        this.setNumeroDeCordas(numeroDeCordas);
        this.estaAfinada = false;
        System.out.println("Registro inicial: Uma " + this.marca + " com " + this.numeroDeCordas + " cordas foi criada!");
    }


    public abstract void exibirTipo();

    public void afinar() {
        this.setEstaAfinada(true);
        System.out.println(" " + this.getMarca() + " foi afinada com sucesso!");
    }

    public void tocar(String musica) {
        if (this.isEstaAfinada() == false) {
            System.out.println("Erro: a guitarra " + this.getMarca() + " não está afinada.");
            return;
        }
        System.out.println(" " + this.getMarca() + " está tocando: " + musica);
    }

    public void trocarCordas(int novoNumero) {
        if (novoNumero != 6 && novoNumero != 7) {
            System.out.println(" Erro: número de cordas inválido. Use 6 ou 7.");
            return;
        }
        this.setNumeroDeCordas(novoNumero);
        this.setEstaAfinada(false);
        System.out.println(" " + this.getMarca() + " agora tem " + this.getNumeroDeCordas() + " cordas. Lembre-se de afinar!");
    }

    public String gerarSom() {
        return "Som genérico de guitarra.";
    }

    public String getMarca() { return this.marca; }
    public int getNumeroDeCordas() { return this.numeroDeCordas; }
    public boolean isEstaAfinada() { return this.estaAfinada; }

    private void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Erro: marca inválida!");
        }
    }

    private void setNumeroDeCordas(int numeroDeCordas) {
        if (numeroDeCordas == 6 || numeroDeCordas == 7) {
            this.numeroDeCordas = numeroDeCordas;
        } else {
            System.out.println("Erro: número de cordas inválido. Usando 6 como padrão.");
            this.numeroDeCordas = 6;
        }
    }

    private void setEstaAfinada(boolean estaAfinada) {
        this.estaAfinada = estaAfinada;
    }
}

