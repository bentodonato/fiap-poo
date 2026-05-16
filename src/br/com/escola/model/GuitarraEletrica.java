package br.com.escola.model;

public class GuitarraEletrica extends Guitarra {

    // Esse aqui é o atributo exclusivo, a mãe Guitarra não tem isso
    private int potenciaWatts;

    // Construtor da filha
    public GuitarraEletrica(String marca, int numeroDeCordas, int potenciaWatts) {
        super(marca, numeroDeCordas);
        this.setPotenciaWatts(potenciaWatts);
    }

    public int getPotenciaWatts() {
        return this.potenciaWatts;
    }

    private void setPotenciaWatts(int watts) {
        if (watts > 0) {
            this.potenciaWatts = watts;
        } else {
            System.out.println("Erro: potência inválida. Usando 10W como padrão.");
            this.potenciaWatts = 10;
        }
    }
}
