package br.unipar;

public abstract class Operation {

    // Exemplo de OverRiding (Sobreescrever) - Continuação do código
    public double calculadoraubtracao() {
        return 0;
    }

    public double calculadoraSoma(){
        return 0;
    }

    public double calculadoraMultiplicacao(){
        return 0;
    }

    public double calculadoraDivisao(){
        return 0;
    }

    public abstract double calculadoraSubtracao(double valorA, double valorB);

    public abstract double calculadoraMais(double valorA, double valorB);

    public abstract double calculadoraMultiplicacao(double valorA, double valorB);

    public abstract double calculadoraDivisao(double valorA, double valorB);
}