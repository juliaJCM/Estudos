package pacote;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class teste {
	static Produto prod;
	
	@BeforeAll
	public void inicio() {
		prod = new Produto();
	}
	
	@Test 
	public static void consegueAlterarValor() {
		prod.alterarValor(2);
		assertEquals(2, prod.getValorProduto());
	}
	
	@Test
	public static void consegueAlterarValorMaximo() {
		prod.alterarValorMaximo(1);
		assertEquals(1, prod.getValorMaximo());
	}
}
