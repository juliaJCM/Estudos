package pacote;

public class Produto {
	private float valorUltCompra;
	private float valorMaximo;
	private float valorProduto;
	
	public Produto() {
		this.valorMaximo = 0;
		this.valorProduto = 0;
		this.valorUltCompra = 0;
	}
	
	public float getValorUltCompra() {
		return valorUltCompra;
	}

	public float getValorProduto() {
		return valorProduto;
	}
	
	public void alterarValor(float valor) {
		if(valor > 0 && valor <= valorMaximo) {
			valorUltCompra = valorProduto;
			valorProduto = valor;
		}	
	}
	
	public void alterarValorMaximo(float valorMax) {
		if(valorMax > 0) {
			valorMaximo = valorMax;
		}
	}

	public float getValorMaximo() {
		return valorMaximo;
	}
	
}
