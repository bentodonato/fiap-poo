package br.com.escola.model;

public class Guitarrista {

    // Atributos privados
    private String nome;
    private int idade;
    private int anosDeExperiencia;

    // Contrutor
    public Guitarrista(String nome, int idade, int anosDeExperiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAnosDeExperiencia(anosDeExperiencia);
        System.out.println("Guitarrista registrado: " + this.nome + ", " + this.idade + " anos!");
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getAnosDeExperiencia() {
        return this.anosDeExperiencia;
    }

    // públicos
    public void apresentar() {
        System.out.println("Olá! Me chamo " + this.nome + ", tenho " + this.idade
                + " anos e " + this.anosDeExperiencia + " anos de experiência.");
    }

    public void praticar(int horas) {
        if (horas <= 0) {
            System.out.println("Erro: o número de horas de prática deve ser maior que zero.");
            return;
        }
        System.out.println("" + this.nome + " praticou por " + horas + " hora(s). Evoluindo!");
    }

    // Setters privados
    private void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro de Validação: Nome inválido!");
        }
    }

    private void setIdade(int idade) {
        if (idade >= 5 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Erro de Validação: Idade inválida!");
        }
    }

    private void setAnosDeExperiencia(int anos) {
        if (anos >= 0) {
            this.anosDeExperiencia = anos;
        } else {
            System.out.println("Erro de Validação: Anos de experiência não podem ser negativos!");
        }
    }
}
