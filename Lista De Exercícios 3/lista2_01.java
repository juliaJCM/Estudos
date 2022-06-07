//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_01 { //Procedimento

	//opera��o da m�dia aritm�tica simples
	public static void mediaA(double num1, double num2, double num3) {
		double ma = (num1 + num2 + num3)/3; 
		System.out.printf("A m�dia aritm�tica simples ser�: %.1f" ,ma);
		}
	
	//opera��o m�dia aritm�tica ponderada
	public static void mediaP(double num1, double num2, double num3) {
		double mp = ((5*num1)+(3*num2)+(2*num3))/(5+3+2);
		System.out.printf("A m�dia aritm�tica ponderada ser�: %.1f" ,mp);
	}
	
	//op��es de opera��o
	public static void lista() { 
	System.out.println("Escolha o tipo de opera��o"); 
	System.out.println("(a)M�dia Aritm�tica Simples");
	System.out.println("(p)M�dia Aritm�tica Ponderada");
	}
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double num1 = 0, num2 = 0, num3 = 0;
		char opcao;
		
		System.out.println("Digite as tr�s notas: ");
		num1=ent.nextDouble();
		num2=ent.nextDouble();
		num3=ent.nextDouble();
		
		lista(); //chamar o m�dulo
		
		System.out.println("Op��o: ");
		opcao = ent.next().charAt(0);
		
		switch (opcao) {
		case 'a': 
			mediaA(num1, num2, num3); //chamar opera��o m�dia aritm�tica simples
			
			break;
			
		case 'p':
			mediaP(num1, num2, num3); //chamar opera��o m�dia aritm�tica ponderada
			
			break;
			
		default: 
			System.out.println("Opera��o Inv�lida");
			
			break;
		}
		
		
ent.close();
	}

}
