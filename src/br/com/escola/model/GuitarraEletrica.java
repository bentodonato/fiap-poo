package br.com.escola.model;

public class GuitarraEletrica extends Guitarra implements Avaliavel {

    private int potenciaWatts;

    public GuitarraEletrica(String marca, int numeroDeCordas, int potenciaWatts) {
        super(marca, numeroDeCordas);
        this.setPotenciaWatts(potenciaWatts);
    }

    public int getPotenciaWatts() { return this.potenciaWatts; }

    private void setPotenciaWatts(int watts) {
        if (watts > 0) {
            this.potenciaWatts = watts;
        } else {
            System.out.println("Erro: potência inválida. Usando 10W como padrão.");
            this.potenciaWatts = 10;
        }
    }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Guitarra Elétrica | Potência: " + this.potenciaWatts + "W | Estilo: Rock e Metal");
    }

    @Override
    public String gerarSom() {
        return "Som elétrico amplificado a " + this.potenciaWatts + "W: WROOM!";
    }

    @Override
    public double calcularNota() {
        if (this.potenciaWatts >= 100) return 10.0;
        if (this.potenciaWatts >= 50)  return 7.5;
        return 5.0;
    }

    @Override
    public void exibirAvaliacao() {
        System.out.println("Avaliação | " + this.getMarca() + " (Elétrica) | Nota: " + this.calcularNota());
    }
}
