//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_07 { //Fun��o 
	
	public static boolean tap(int num1) {
		return (num1 >= 0);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		// vari�vel utilizada
		int num1, x;
		
		System.out.println("Digite a quantidade de n�meros: ");
		x = ent.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println("Digite um n�mero: ");
			num1 = ent.nextInt();
			
		//o if foi usado para retornar o valor l�gico (verdadeiro ou falso) a partir do n�mero digitado (num1)
		if (tap(num1)) { //chamar o m�dulo
			System.out.println("O n�mero digitado � POSITIVO");
		}
		else {
			System.out.println("O n�mero digitado � NEGATIVO");
		}
		
	}
		
ent.close();
	}

}
