//atividade 02 da lista do laborat�rio
import java.util.Scanner;
public class atividade02 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int nota;
		
		System.out.println("Digite sua nota:");
		nota=ent.nextInt();
		
		if (nota >= 8 && nota <= 10) {
			System.out.println("�timo");
		}
		
		else if (nota >= 7 && nota < 8) {
			System.out.println("Bom");
		}
		
		else if (nota >= 5 && nota < 7) {
			System.out.println("Regular");
		}
		
		else {
			System.out.println("Insatisf�torio");
		}
		
		
ent.close();
	}

}
