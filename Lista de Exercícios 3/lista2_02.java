//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_02 { //Procedimento
	
	public static void prefeitura(double totalsal, double popul) {
		double media = 0;
		media = totalsal/popul;
		System.out.printf("A m�dia salarial da popula��o ser�: %.2f" , media);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		double sal, media = 0, totalsal = 0;
		double filho, popul = 0;
		char opcao = 0;
				
		while (opcao != 'e') {
			
			System.out.println("Digite o sal�rio: ");
			sal = ent.nextDouble();
			
			System.out.println("Digite o total de filhos: ");
			filho = ent.nextInt();
			
			totalsal = totalsal+sal;
			popul++;
		
			
			System.out.printf("Encerrar procedimento? (e)-Encerrar \n");
			opcao = ent.next().charAt(0);
		}
		
		prefeitura(totalsal, popul); //chamar o m�dulo
		
ent.close();		
	}
}
