//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_06 { //Fun��o 
	
	public static double valores(double N){
		double S = 1, E = 1;
		for (double x = 1; x <= N; x++) {
		S = x*S;  //multiplica��o do limitante pelo fatorial
		E = (E+1)/S; //divis�o pela vari�vel e consequentemente a resposta
		}     
		return (E);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		double N = 1;
	
		System.out.println("Digite um n�mero:");
		N = ent.nextInt();
		
		System.out.println("O total ser�: " + valores(N)); //chamar o m�dulo
		

ent.close();

	}

}
