//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_01 { //Procedimento

	//operação da média aritmética simples
	public static void mediaA(double num1, double num2, double num3) {
		double ma = (num1 + num2 + num3)/3; 
		System.out.printf("A média aritmética simples será: %.1f" ,ma);
		}
	
	//operação média aritmética ponderada
	public static void mediaP(double num1, double num2, double num3) {
		double mp = ((5*num1)+(3*num2)+(2*num3))/(5+3+2);
		System.out.printf("A média aritmética ponderada será: %.1f" ,mp);
	}
	
	//opções de operação
	public static void lista() { 
	System.out.println("Escolha o tipo de operação"); 
	System.out.println("(a)Média Aritmética Simples");
	System.out.println("(p)Média Aritmética Ponderada");
	}
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double num1 = 0, num2 = 0, num3 = 0;
		char opcao;
		
		System.out.println("Digite as três notas: ");
		num1=ent.nextDouble();
		num2=ent.nextDouble();
		num3=ent.nextDouble();
		
		lista(); //chamar o módulo
		
		System.out.println("Opção: ");
		opcao = ent.next().charAt(0);
		
		switch (opcao) {
		case 'a': 
			mediaA(num1, num2, num3); //chamar operação média aritmética simples
			
			break;
			
		case 'p':
			mediaP(num1, num2, num3); //chamar operação média aritmética ponderada
			
			break;
			
		default: 
			System.out.println("Operação Inválida");
			
			break;
		}
		
		
ent.close();
	}

}
