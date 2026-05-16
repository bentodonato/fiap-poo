package br.com.escola.model;

public class GuitarraEletrica extends Guitarra {

    private int potenciaWatts;

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

    @Override
    public String gerarSom() {
        return "Som elétrico amplificado a " + this.potenciaWatts + "W: WROOM! Distorção total no som!";
    }
}
