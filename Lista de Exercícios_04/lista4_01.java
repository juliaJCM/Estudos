//atividade 01 da lista 4 
import java.util.Scanner;
public class lista4_01 {

	public static int Soma(int num1) {
		if (num1 < 0) {
			System.out.println("N�mero n�o pode ser negativo!"); //o valor n�o pode ser menor que zero 
		}
		else if (num1 < 10) {
			return num1;
		}
		else {
			return Soma(num1/10) + num1 % 10; //divide-se o n�mero digitado por 10 e soma-se o resto da divis�o mais o n�mero digitado
		}
		return num1;
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		int num = 0;
		
		System.out.println("Digite um n�mero: ");
		num = ent.nextInt();
		
		System.out.println("O resultado ser�: "+ Soma(num)); //chamar a fun��o
		
ent.close();
	}

}
