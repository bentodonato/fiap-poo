package br.com.escola.model;

public class Guitarra {

    // Atributos
    public String marca;
    public int numeroDeCordas;
    public boolean estaAfinada;

    // Construtor
    public Guitarra(String marca, int numeroDeCordas) {
        this.marca = marca;
        this.numeroDeCordas = numeroDeCordas;
        this.estaAfinada = false;
    }

    // Método 1
    public void afinar() {
        this.estaAfinada = true;
        System.out.println(this.marca + " foi afinada com sucesso!");
    }

    // Método 2
    public void tocar(String musica) {
        // Regra de negócio: só toca se estiver afinada
        if (this.estaAfinada == false) {
            System.out.println("Erro: a guitarra " + this.marca + " não está afinada. Afine antes de tocar.");
            return;
        }
        System.out.println(this.marca + " está tocando: " + musica);
    }

    // Método 3
    public void trocarCordas(int novoNumero) {
        // Regra de negócio: só aceita 6 ou 7 cordas
        if (novoNumero != 6 && novoNumero != 7) {
            System.out.println("Erro: número de cordas inválido. Use 6 ou 7.");
            return;
        }
        this.numeroDeCordas = novoNumero;
        this.estaAfinada = false; // Após trocar cordas, vai precisar afinar de novo
        System.out.println(this.marca + " agora tem " + this.numeroDeCordas + " cordas. Lembre-se de afinar!");
    }
}