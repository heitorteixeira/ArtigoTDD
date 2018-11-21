package artigotdd.calculadora.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import artigotdd.calculadora.Calculadora;

public class CalculadoraTeste {

	@Test
    public void deveriaSomarDoisValoresPassados() throws Exception {
		int valorA = 1;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);
 
        assertEquals(3, soma);
    }
	
	@Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception {
		int valorA = 1;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtrai(valorA, valorB);
 
        assertEquals(-1, subtracao);
    }
	
	@Test
    public void deveriaDividirDoisValoresPassados() throws Exception {
        int valorA = 6;
        int valorB = 3;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);
 
        assertEquals(2, divisao);
    }
	
	@Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
             throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);
 
        assertEquals(0, divisao);
    }
}
