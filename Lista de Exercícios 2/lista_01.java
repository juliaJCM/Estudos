//lista de atividades da Rosilane - 28/04
import java.util.Scanner;

public class lista_01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//vari�veis utilizadas
		int num1;
		char opcao = 0;
		int positivos = 0, negativos = 0, zeros = 0;
		
		//e estrutura while foi utilizada, pois n�o havia um limite 
		while (opcao != 's')
		{
			System.out.println("Digite um n�mero: ");
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
		
		System.out.println("A quantidade de n�meros positivos �: " + positivos);
		System.out.println("A quantidade de n�meros negativos �: " + negativos);
		System.out.println("A quantidade de zeros �: " + zeros);
			
			
ent.close();
	}

}
