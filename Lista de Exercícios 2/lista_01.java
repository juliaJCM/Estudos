//lista de atividades da Rosilane - 28/04
import java.util.Scanner;

public class lista_01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//variáveis utilizadas
		int num1;
		char opcao = 0;
		int positivos = 0, negativos = 0, zeros = 0;
		
		//e estrutura while foi utilizada, pois não havia um limite 
		while (opcao != 's')
		{
			System.out.println("Digite um número: ");
			num1 = ent.nextInt();
			
			if (num1 > 0) 
			{
				positivos++;
			}
			else if (num1 < 0)
			{
				negativos++;
			}
			else 
			{
				zeros++;
			}
			System.out.printf("Digite 's' para encerrar \n");
			opcao = ent.next().charAt(0);
		}
		
		System.out.println("A quantidade de números positivos é: " + positivos);
		System.out.println("A quantidade de números negativos é: " + negativos);
		System.out.println("A quantidade de zeros é: " + zeros);
			
			
ent.close();
	}

}
