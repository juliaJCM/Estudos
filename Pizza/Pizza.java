package pacote;

public class Pizza {
	private static final int maxAdicionais = 8;
	private static final int minAdicionais = 1;
	private int adicionais;
	private String nota;
	
	/** 
	 *Método adicionarIngrediente que recebe uma variável por parâmetro e realiza sua verificação.
	 *Caso o cliente escolha adicionais que ultrapassam o limite proposto ou que não escolha nenhum adicional, 
	 *uma mensagem a atribuida a cada verficação.
	 * @param opcao: recebe a quantidade de ingredientes a ser adicionado por parâmetro.
	 */
	public void adicionarIngrediente(int opcao) {
		if(opcao < minAdicionais) {
			System.out.println("É preciso escolher ao menos um acréscimo!");
			
		}
		else if (opcao > maxAdicionais){
			System.out.println("Número de acréscimos excedido!");
			
		}
		else {
			for(int i = minAdicionais; i <= opcao; i++) {			
				adicionais = i;
			}
		}
	}
	
	/**
	 *Método removerIngrediente que recebe uma variável por parâmetro e realiza sua verificação. Sendo realizada a verificação
	 *a quantidade de adicionais solicitada é removida.
	 * @param opcao recebe a quantidade de ingredientes a ser removido por parâmetro.
	 */
	public void removerIngrediente(int opcao) {
		if(adicionais - opcao < minAdicionais) {
			System.out.println("Quantidade inferior");
			adicionais = minAdicionais - 1;
		}
		else {
			adicionais -= opcao;
		}
	}
	
	/**
	 * Método nota1 salva na variável nota os detalhes do pedido.
	 * 
	 * @return retorna os detalhes do pedido por uma String
	 */
	public String nota1() {
		nota = "DETALHES DO PEDIDO:";
		nota += "\nDescrição: Pizza básica contendo queijo e calabresa";
		nota += "\nValor Total: R$25";
		
		return this.nota;
	}
	
	/**
	 * Método nota2 salva na variável nota os dados do pedido.
	 * 
	 * @return retorna os detalhes do pedido por uma Strings.
	 * 
	 */
	public String nota2() {
		if(adicionais < minAdicionais) {
			nota = "\nNão foi possível gerar uma nota!";
			return nota;
		}
		else {
		nota = "DETALHES DO PEDIDO";
		nota += "\nDescrição: Pizza personalizada contendo queijo e calabresa e " + adicionais + " acréscimos";
		nota += "\nValor da pizza: R$25";
		nota += "\nValor total dos acréscimos: R$" + (adicionais * 4) + "\n";
		nota += "\nValor Total: R$" + (25 + (adicionais * 4));
		
		return this.nota;
	}	
		
	}
}
