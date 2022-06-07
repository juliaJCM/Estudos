//atividade 01 da lista do laboratório
import java.util.Scanner;
public class atividade01 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int num1, num2, resposta;
		
		System.out.println("Digite dois números:");
		num1=ent.nextInt();
		num2=ent.nextInt();
		
		resposta=num1+num2;
		if (resposta >= 10) {
			System.out.println("A resposta será: " + (resposta+5));
		}
		
		else if (resposta < 10) {
			System.out.println("A resposta será:" + (resposta+7));
		}
		
ent.close();
	}

}
