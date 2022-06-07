//atividade 05 da lista do laboratório
import java.util.Scanner;
public class atividade05 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double limit, resu, b;
		
		System.out.println("Digite um limite:");
		limit=ent.nextDouble();
	
		resu=0;
		for (b=1; b <= limit; b++) {
			resu = 1/b+resu;
			System.out.printf("O valor de d é %.1f \n",resu);
		}
		
		System.out.printf("O resultado final será %.1f",resu);
	
ent.close();		
	}
	
}
