//lista de atividades da Rosilane - 28/04 - Atividade 3
import java.util.Scanner;
public class lista_03 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		//vari�veis utilizadas
		int num1;
		double E = 1, F = 1;
	
		System.out.println("Digite um n�mero:");
		num1 = ent.nextInt();
		//o for foi utilizado, pois havia um limite de repeti��es
		for (int x = 1; x <= num1; x++)
		{
			//o x � o limitante da vari�vel num1(limite) 
			//multiplica-se primeiro o limitante(x) pelo fatorial(F)
			//em seguida ele � divido pela vari�vel de resposta(E)
			F = x*F;
			E = E+1/F;
		}
		System.out.println("O total ser�: " + E);
		

ent.close();
	}

}
