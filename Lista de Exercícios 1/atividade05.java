//atividade 05 da lista do laborat�rio
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
			System.out.printf("O valor de d � %.1f \n",resu);
		}
		
		System.out.printf("O resultado final ser� %.1f",resu);
	
ent.close();		
	}
	
}
