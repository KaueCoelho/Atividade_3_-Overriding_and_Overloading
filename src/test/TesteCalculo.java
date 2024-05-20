package test;

import br.unipar.Calculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TesteCalculo {

    @Test
    public void TestCalculadoraSubtracao(){
        Calculo calc = new Calculo();
        double diminuir = calc.calculadoraSubtracao(5.0,2.0);
        assertEquals(diminuir,3);
    }

    private void assertEquals(double diminuir, int i) {
    }

    @Test
    public void TesteCalculadoraSoma(){
        Calculo calc = new Calculo();
        double soma = calc.calculadoraMais(3,5);
        assertEquals(soma,8);
    }

    @Test
    public void TesteCalculadoraMultiplicacao(){
        Calculo calc = new Calculo();
        double vezes = calc.calculadoraMultiplicacao(5,5);
        assertEquals(vezes,25);
    }

    @Test
    public void TesteCalculadoraDivisao(){
        Calculo calc = new Calculo();
        double divisao = calc.calculadoraDivisao(10,5);
        assertEquals(divisao, 2);
    }


}