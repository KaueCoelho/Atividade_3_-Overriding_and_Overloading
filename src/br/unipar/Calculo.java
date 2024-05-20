package br.unipar;

    public class Calculo extends Operation{

        public int calculadoraSoma(int a, int b){
            return a+b;
        }

        public int calculadoraSoma(int a, int b, int c){
            return a+b+c;
        }

        public String calculadoraSoma(String a, String b){
            return a+b;
        }

        public double calculadoraSubtracao(double valorA, double valorB){
            double resultado = valorA - valorB;
            return resultado;
        }

        @Override
        public double calculadoraMais(double valorA, double valorB) {
            return 0;
        }

        public double calculadoraSoma(double valorA, double valorB){
            double resultado = valorA + valorB;
            return resultado;
        }

        public double calculadoraMultiplicacao(double valorA, double valorB){
            double resultado = valorA * valorB;
            return resultado;
        }

        public double calculadoraDivisao(double valorA, double valorB){
            double resultado = valorA / valorB;
            return resultado;
        }
    }

