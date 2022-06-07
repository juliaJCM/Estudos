//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_03 { //Procedimento 
	
	public static void crescente(int num1, int num2, int num3) {
	//o if foi usado para comparar cada número inteiro e fornecer a resposta ao final do procedimento
		if (num1 < num2) {
			if (num2 < num3) 
			{
				System.out.println("A ordem será: " + num1 + " " + num2 + " " + num3);
			}
			else if (num1 < num3) 
			{
				System.out.println("A ordem será: " + num1 + " " + num3 + " " + num2);
			}
			else {
				System.out.println("A ordem será: " + num3 + " " + num1 + " "+ num2);
			}
				}
		
			else if (num2 < num3) {
				if (num1 < num3) 
				{
					System.out.println("A ordem será: " + num2 + " " + num1 + " " + num3);
				}
				else {
					System.out.println("A ordem será: " + num2 + " " + num3 + " " + num1);
					}
				}
				
				else {
					System.out.println("A ordem será: " + num3 + " " + num2 + " " + num1);
				}				
	}
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//variáveis usadas
		int num1, num2, num3;
		
		System.out.println("Digite três números inteiros: ");
		num1 = ent.nextInt();
		num2 = ent.nextInt();
		num3 = ent.nextInt();
		
		crescente(num1, num2, num3); //chamar o método
		
ent.close();	
	}

}
