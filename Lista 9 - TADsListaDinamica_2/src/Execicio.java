import java.util.Scanner;
public class Execicio {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		Lista y = new Lista();
		
		for (int i = 0; i < 4; i++) {
			Celula x = new Celula();
			
			if(ent.hasNextLine()) {
				ent.nextLine();
			}
			
			System.out.println("Digite seu nome: ");
			x.nome = ent.nextLine();
			
			System.out.println("Digite sua idade: ");
			x.idade = ent.nextInt();	
			
			y.inserirInicio(x);
		}
		
		y.getTam();
		y.mostrar();
		
		System.out.println("\nA média iterativa será: " + y.funcaoIterat());
		
	}
}
