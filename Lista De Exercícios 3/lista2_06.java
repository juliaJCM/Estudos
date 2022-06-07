//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_06 { //Função 
	
	public static double valores(double N){
		double S = 1, E = 1;
		for (double x = 1; x <= N; x++) {
		S = x*S;  //multiplicação do limitante pelo fatorial
		E = (E+1)/S; //divisão pela variável e consequentemente a resposta
		}     
		return (E);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		double N = 1;
	
		System.out.println("Digite um número:");
		N = ent.nextInt();
		
		System.out.println("O total será: " + valores(N)); //chamar o módulo
		

ent.close();

	}

}
