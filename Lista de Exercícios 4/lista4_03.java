//atividade 03 da lista 4 
import java.util.Scanner;
public class lista4_03 {

	public static int resto(int num1, int denomi) {
		if (num1 < denomi) { //se o numerador for menor que o denominador
			return num1;
		}
		else {
			return (resto(num1 - denomi, denomi)); //calcula o numerador pelo denominador e dá seu resto
		}
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//variáveis usadas
		int num, deno;
		
		System.out.println("Digite um número: ");
		num = ent.nextInt();
		
		System.out.println("Digite o denominador: ");
		deno = ent.nextInt();
		
		System.out.println("O resto da divisão será: " + resto(num, deno)); //chamar a função
		
ent.close();		
	}

}
