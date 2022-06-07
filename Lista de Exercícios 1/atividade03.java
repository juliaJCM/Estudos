//atividade 03 da lista do laboratório
import java.util.Scanner;
public class atividade03 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double valor, d, z, x, dif;
		
		System.out.println("Qual o valor da diária?");
		valor=ent.nextDouble();
		
		d=valor-(valor*25/100);
		System.out.printf("O valor da diária promocional será %.0f \n", d);
		
		x=d*60;
		System.out.printf("O valor total arrecadado será %.0f \n", x);
		
		z=valor*38;
		System.out.printf("O valor total arrecadado será %.0f \n", z);
		
		dif=(d*60)-(valor*38);
		System.out.printf("A diferença dos dois valores será %.0f \n", dif);
		
		
ent.close();
	}

}
