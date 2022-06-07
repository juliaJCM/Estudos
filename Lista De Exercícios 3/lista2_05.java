//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_05 { //Procedimento 

	public static void nota(double num1) {
		//o if foi usado para comparar a média final e exibir seu conceito logo em seguida
		if (num1 <= 39) {
			System.out.println("Conceito: F");
		}
		
		else if ((num1 >= 40) && (num1 <= 59)) {
			System.out.println("Conceito: E");
		}
		
		else if ((num1 >= 60) && (num1 <= 69)) {
			System.out.println("Conceito: D");
		}
		
		else if ((num1 >= 70) && (num1 <= 79)) {
			System.out.println("Conceito: C");
		}
		
		else if ((num1 >= 80) && (num1 <= 89)) {
			System.out.println("Conceito: B");
		}
		
		else {
			System.out.println("Conceito: A");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//variáveis usadas
		double num1;
		
		System.out.println("Digite a média do aluno: ");
		num1 = ent.nextDouble();
	
		nota(num1);
		
ent.close();
	}

}
