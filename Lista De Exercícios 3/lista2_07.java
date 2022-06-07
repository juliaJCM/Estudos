//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_07 { //Função 
	
	public static boolean tap(int num1) {
		return (num1 >= 0);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		// variável utilizada
		int num1, x;
		
		System.out.println("Digite a quantidade de números: ");
		x = ent.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println("Digite um número: ");
			num1 = ent.nextInt();
			
		//o if foi usado para retornar o valor lógico (verdadeiro ou falso) a partir do número digitado (num1)
		if (tap(num1)) { //chamar o módulo
			System.out.println("O número digitado é POSITIVO");
		}
		else {
			System.out.println("O número digitado é NEGATIVO");
		}
		
	}
		
ent.close();
	}

}
