package pacote;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Produto prod1 = new Produto();
		ListaDeCompras lista = new ListaDeCompras();
		Random ran = new Random();
		
		System.out.println("Deseja acrescentar um limite de orçamento à sua lista de compras? (1 - Sim ou 2 - Não)");
		int opcao = ent.nextInt();
		
		prod1.alterarValorMaximo(20);
		prod1.alterarValor(10);
		lista.alterarValorMaximo(20);
		lista.adicionaProduto(prod1, opcao);
		prod1.alterarValor(4);
		lista.adicionaProduto(prod1, opcao);
		System.out.println(lista.finalizaCompra());
		
		
ent.close();		
	}

}
