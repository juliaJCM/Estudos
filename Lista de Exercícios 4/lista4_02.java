//atividade 02 da lista 4 
import java.util.Scanner;
public class lista4_02 {
	
	public static int divisao(int num1, int divisor) {
		if (num1 < divisor) { //se numerador menor que o denominador  
			return 0;
		}
		else {
			return (divisao(num1 - divisor, divisor)+1); //c�lculo da divis�o
		}
	}
		
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		int numer, deno;
		
		System.out.println("Digite o numerador: ");
		numer = ent.nextInt();
		
		System.out.println("Digite o denominador: ");
		deno = ent.nextInt();
		
		System.out.println("O resultado ser�: " + divisao(numer, deno)); //chamar a fun��o
		
		
ent.close();		
	}

}
