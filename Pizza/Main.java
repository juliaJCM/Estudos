package pacote;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Pizza produto = new Pizza();
		
		System.out.println("Escolha a pizza desejada(1 - Básica ou 2 - Personalizada): ");
		int opcao = ent.nextInt();
		
		if(opcao == 1) {
			System.out.println(produto.nota1());
		}
		else if (opcao == 2) {
			System.out.println("Escolha até 8 acréscimos: ");
			opcao = ent.nextInt();
			produto.adicionarIngrediente(opcao);
			
			System.out.println("Quantos acréscimos deseja remover: ");
			opcao = ent.nextInt();
			produto.removerIngrediente(opcao);
			System.out.println(produto.nota2());
		}
	}
}
