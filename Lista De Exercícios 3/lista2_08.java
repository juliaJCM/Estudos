//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_08 { //Função
	
	//função com parâmetros (não recebe void)
	public static double valor(int rep) {
		double S = 0;
		
		for (double i = 1; i <= rep; i++) {
		S = S + ((i*i)+1)/(i+3); 
		}
		return (S);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//variáveis usadas
		int rep;
		
		System.out.println("Digite o número de repetições: ");
		rep = ent.nextInt();
		
		System.out.printf("O valor será: %.2f" ,valor(rep));//chamar o módulo
			
		
ent.close();
	}

}
