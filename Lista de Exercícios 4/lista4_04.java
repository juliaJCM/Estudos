//atividade 04 da lista 4 
import java.util.Scanner;
public class lista4_04 {
	
	public static int MOD(int num1, int denomi) {
		if (num1 < denomi) { //retorna o valor do n�mero caco o mesmo seja menor que o denominador
			return num1;
		}
		
		else if (num1 == denomi) { //retorna o valor zero caso o n�mero seja igual ao denominador
			return 0;
		}
		
		else {
			return (MOD(num1 - denomi, denomi)); //calculo de resto
		}
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		int num, deno;
		
		System.out.println("Digite um valor: ");
		num = ent.nextInt();
		
		System.out.println("Digite seu denominador: ");
		deno = ent.nextInt();
		
		System.out.println("O resto da divis�o ser�: " + MOD(num, deno)); //chama a fun��o

ent.close();
	}

}
