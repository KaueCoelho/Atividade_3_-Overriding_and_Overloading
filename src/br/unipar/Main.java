package br.unipar;

public class Main {

    public static void main(String args[]){
        Calculo calc = new Calculo();

        //Operações de mais herdadas co overriding
        System.out.println("Operações de mais herdadas co overriding");
        System.out.println(calc.calculadoraSoma(5,9));
        System.out.println(calc.calculadoraSoma(5,5,5));
        System.out.println(calc.calculadoraSoma(3.5,6.5));
        System.out.println(calc.calculadoraSoma("Calcu","ladora"));
        System.out.println();

        // Operações de menos herdadas com overriding
        System.out.println("Operações de menos herdadas com overriding");
        System.out.println(calc.calculadoraSubtracao(17,6));
        System.out.println(calc.calculadoraSubtracao(50,30));
        System.out.println();

        // Operações de vezes herdadas com overriding
        System.out.println("Operações de vezes herdadas com overriding");
        System.out.println(calc.calculadoraMultiplicacao(5,5));
        System.out.println(calc.calculadoraMultiplicacao(10,50));
        System.out.println();

        // Operações de divisão herdadas com overrding;
        System.out.println("Operações de divisão herdadas com overrding");
        System.out.println(calc.calculadoraDivisao(10,5));
        System.out.println(calc.calculadoraDivisao(5,5));
    }

}