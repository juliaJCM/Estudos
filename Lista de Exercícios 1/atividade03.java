//atividade 03 da lista do laborat�rio
import java.util.Scanner;
public class atividade03 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double valor, d, z, x, dif;
		
		System.out.println("Qual o valor da di�ria?");
		valor=ent.nextDouble();
		
		d=valor-(valor*25/100);
		System.out.printf("O valor da di�ria promocional ser� %.0f \n", d);
		
		x=d*60;
		System.out.printf("O valor total arrecadado ser� %.0f \n", x);
		
		z=valor*38;
		System.out.printf("O valor total arrecadado ser� %.0f \n", z);
		
		dif=(d*60)-(valor*38);
		System.out.printf("A diferen�a dos dois valores ser� %.0f \n", dif);
		
		
ent.close();
	}

}
