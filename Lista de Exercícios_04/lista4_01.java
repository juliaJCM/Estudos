//atividade 01 da lista 4 
import java.util.Scanner;
public class lista4_01 {

	public static int Soma(int num1) {
		if (num1 < 0) {
			System.out.println("Número não pode ser negativo!"); //o valor não pode ser menor que zero 
		}
		else if (num1 < 10) {
			return num1;
		}
		else {
			return Soma(num1/10) + num1 % 10; //divide-se o número digitado por 10 e soma-se o resto da divisão mais o número digitado
		}
		return num1;
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//variáveis usadas
		int num = 0;
		
		System.out.println("Digite um número: ");
		num = ent.nextInt();
		
		System.out.println("O resultado será: "+ Soma(num)); //chamar a função
		
ent.close();
	}

}
