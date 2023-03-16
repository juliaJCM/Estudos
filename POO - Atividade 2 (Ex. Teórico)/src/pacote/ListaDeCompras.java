package pacote;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
	private List<Produto> produtos = new ArrayList<>();
	private float valorTotal;
	private float valorMaximoOrcamento;
	private float valorMaximoAnterior;
	
	public ListaDeCompras() {
		this.valorTotal = 0;
		this.valorMaximoOrcamento = 0;
		this.valorMaximoAnterior = 0;
	}
	
	/**
	 * O método adicionaProduto verifica a opção escolhida e realiza a comparação 
	 * do valor total dos produtos ao valor máximo de orçamento. Caso o usuário opte por
	 * não incluir um limite, a lista é preenchida até que o usuário decida finalizar a compra.
	 * 
	 * @param prod paramêtro criado para armazenar um produto à lista de compras.
	 * @param opcao paramêtro criado para verificar a opção escolhida pelo usuário.
	 */
	public void adicionaProduto(Produto prod, int opcao) {

		if (opcao == 1) {
			if ((valorTotal + prod.getValorProduto()) <= valorMaximoOrcamento) {
				produtos.add(prod);
				valorTotal += prod.getValorProduto();
				valorMaximoAnterior += prod.getValorUltCompra();
			}
		}
		else {
			produtos.add(prod);
			valorTotal += prod.getValorProduto();
			valorMaximoAnterior += prod.getValorUltCompra();
		}
	}

	public String finalizaCompra() {
		String detalhe;

		detalhe = "Compra realizada com sucesso!\n";
		detalhe += "O valor total da compra foi: R$ " + valorTotal;
		detalhe += "\nO valor total anterior utilizado de cada produto foi: R$ " + valorMaximoAnterior;
		
		return detalhe;
		}
	
	public void alterarValorMaximo(float altera) {
		if(altera > 0) {
			valorMaximoOrcamento = altera;
		}
	}
	}
