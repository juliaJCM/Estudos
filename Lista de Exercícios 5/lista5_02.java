import java.util.Scanner;

public class lista5_02 {

	public static void proced(int [] valor) {
		Scanner ent = new Scanner(System.in);
		for(int i=0; i <valor.length; i++) {
			System.out.println("Digite os valores");
			valor [i] = ent.nextInt();
		}
	}
	
	public static int [] func(int [] valor) {
		int quant = 0;
		for(int i=0; i <valor.length; i++) {
			if (valor [i] < 0) {
				quant++;
			}
		}
		
		int [] neg = new int [quant];
		int j = 0;
		for(int i=0; i <valor.length; i++) {
			if (valor [i] < 0) {
				neg [j] = valor[i];
				j++;
			}
		}
		return neg;
	}
	
	public static void exibe(int [] valor) {

		for(int i=0; i <valor.length; i++) {
			System.out.println(valor[i]);			
		}
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//variaveis
		int [] vet = new int [10];
		
		//chamando métodos
		proced(vet);
		func(vet);
		System.out.println("Os valores negativos são:");
		exibe(func(vet));
		
		
ent.close();
	}

}
