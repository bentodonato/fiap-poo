package br.com.escola.model;

public class Guitarrista implements Avaliavel {

    private String nome;
    private int idade;
    private int anosDeExperiencia;
    private Guitarra guitarra;

    public Guitarrista(String nome, int idade, int anosDeExperiencia, Guitarra guitarra) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAnosDeExperiencia(anosDeExperiencia);
        this.guitarra = guitarra;
        System.out.println("Guitarrista registrado: " + this.nome + " com uma " + this.guitarra.getMarca() + "!");
    }

    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
    public int getAnosDeExperiencia() { return this.anosDeExperiencia; }
    public Guitarra getGuitarra() { return this.guitarra; }

    public void apresentar() {
        System.out.println("Olá! Me chamo " + this.nome + ", tenho " + this.idade
                + " anos, " + this.anosDeExperiencia + " anos de experiência.");
        System.out.println("Minha guitarra é uma " + this.guitarra.getMarca()
                + " com " + this.guitarra.getNumeroDeCordas() + " cordas.");
    }

    public void praticar(int horas) {
        if (horas <= 0) {
            System.out.println("Erro: o número de horas deve ser maior que zero.");
            return;
        }
        System.out.println("" + this.nome + " praticou por " + horas + " hora(s). Evoluindo!");
    }

    @Override
    public double calcularNota() {
        if (this.anosDeExperiencia >= 10) return 10.0;
        if (this.anosDeExperiencia >= 5)  return 8.0;
        if (this.anosDeExperiencia >= 2)  return 6.0;
        return 4.0;
    }

    @Override
    public void exibirAvaliacao() {
        System.out.println("Avaliação | Guitarrista: " + this.nome + " | Nota: " + this.calcularNota());
    }

    private void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) { this.nome = nome; }
        else { System.out.println("Erro: nome inválido!"); }
    }

    private void setIdade(int idade) {
        if (idade >= 5 && idade <= 100) { this.idade = idade; }
        else { System.out.println("Erro: idade inválida!"); }
    }

    private void setAnosDeExperiencia(int anos) {
        if (anos >= 0) { this.anosDeExperiencia = anos; }
        else { System.out.println("Erro: anos de experiência inválidos!"); }
    }
}
