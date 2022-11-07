//Atividade 07-11-2022
import java.util.Scanner;
public class Ex_1 {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		Pilha var = new Pilha();
		System.out.println("Digite um número inteiro: ");
		var.empilha(ent.nextInt());
		
		System.out.println("Digite um número inteiro: ");
		var.empilha(ent.nextInt());
		
		System.out.println("Digite um número inteiro: ");
		var.empilha(ent.nextInt());
		
		System.out.println("Digite um número inteiro: ");
		var.empilha(ent.nextInt());
		
		var.printTamanho();
		
		var.mostrar();
	
		ent.close();
	}
	
}
