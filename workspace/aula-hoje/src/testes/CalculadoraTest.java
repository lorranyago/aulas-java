package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Calculadora;


class CalculadoraTest {
	
	private Calculadora cal = new Calculadora(9, 3);
	
	@Test
	public void DeveriaRetornarSomaCerta() {
		int soma = cal.soma();
		assertEquals(12, soma);
	}
	@Test
	public void DeveriaRetornarSubtracaoCerta( ) {
		int subtracao = cal.subtracao();
		assertEquals(6, subtracao); // ta 
	}
	
	@Test
	public void DeveriaRetornarMultCerta() {
		int multiplicacao = cal.multiplicacao();
		assertEquals(27, multiplicacao);
	}
	@Test
	public void DeveriaRetornardivisaoCerta() {
		int divisao = cal.divisao();
		assertEquals(3, divisao);
	}
	@Test()
	public void DeveriaRetornarException() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> cal.soma(110, 5));
		assertEquals("O primeiro número deve ser menor que 99", ex.getMessage());
	}
}
