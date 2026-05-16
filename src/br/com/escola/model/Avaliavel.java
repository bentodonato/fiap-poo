package br.com.escola.model;

// Todo método público e abstrato por padrão
public interface Avaliavel {

    double NOTA_MAXIMA = 10.0;
    double NOTA_MINIMA = 0.0;
    double calcularNota();
    void exibirAvaliacao();
}
