//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_08 { //Fun��o
	
	//fun��o com par�metros (n�o recebe void)
	public static double valor(int rep) {
		double S = 0;
		
		for (double i = 1; i <= rep; i++) {
		S = S + ((i*i)+1)/(i+3); 
		}
		return (S);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		int rep;
		
		System.out.println("Digite o n�mero de repeti��es: ");
		rep = ent.nextInt();
		
		System.out.printf("O valor ser�: %.2f" ,valor(rep));//chamar o m�dulo
			
		
ent.close();
	}

}
