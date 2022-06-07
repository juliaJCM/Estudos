//lista de atividades da Rosilane - 28/04
import java.util.Scanner;
public class lista_02 { //Procedimento - SEM Par�metro

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//vari�veis utilizadas
		int num1;
		char opcao = 0;
		int positivos = 0, negativos = 0, zeros = 0;
		double total = 0;
		double porcent1, porcent2, porcent3;
		//e estrutura while foi utilizada, pois n�o havia um limite 
		while (opcao != 's')
		{
			System.out.println("Digite um n�mero: ");
			num1 = ent.nextInt();
			// o if  foi utilizado para encontrar o total de n�meros positivos, negativos e zeros
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
			
			total++;
		}
		
		System.out.println("A quantidade de n�meros positivos �: " + positivos);
		System.out.println("A quantidade de n�meros negativos �: " + negativos);
		System.out.println("A quantidade de zeros �: " + zeros);
		//Ao encontrar o total de n�meros positivos, negativos e zeros, foi calculada a porcentagem de cada um
		porcent1 = (positivos*100)/total;
		System.out.println("A porcentagem de n�meros positivos �: " + porcent1);
		
		porcent2 = (negativos*100)/total;
		System.out.println("A porcentagem de n�meros negativ �: " + porcent2);
		
		porcent3 = (zeros*100)/total;
		System.out.println("A porcentagem de zeros �: " + porcent3);
			
ent.close();
	}

}
