//lista de atividades da Rosilane - 28/04
import java.util.Scanner;
public class lista_04 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		//variáveis utilizadas
		double num1 = 1, num2 = 0; 
		double limit = 0; 
		
		System.out.println("Digite um número:");
		limit = ent.nextDouble();
		//o for foi utilizado, pois havia um limite de repetições 
		//o if foi utilizado para igualar x a 1
		for (double x=1; x <= limit; x++) {
			if(x == 1) {
				System.out.println("1");
			}
			num1 = num1 + num2;
			num2 = num1 - num2;
			
			System.out.println(num1);
		}
		
			
ent.close();
	}

}
