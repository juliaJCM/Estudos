//atividade 05 da lista 4 
import java.util.Scanner;
public class lista4_05 {
	
	public static double result(int x) { //fatorial
		double S=0; //variavel de resultado
		
		for(int i=1; i <= x; i++) {
			S = S + (1/serie(i)); //c�lculo da resposta final
		}
		return S; 
	}
	
	public static double serie(int N){ //fatorial
		
		if (N == 1 || N == 0) {
			return 1;
		}
		else {
			return (N*serie(N-1)); //c�lculo do fatorial 
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		int fato;
		
		System.out.println("Digite um n�mero: ");
		fato = ent.nextInt();
		
		System.out.printf("O resultado ser�: %.1f" , result(fato)); //chamar a fun��o
		
ent.close();
	}

}
