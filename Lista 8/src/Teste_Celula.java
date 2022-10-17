//java.util.Scanner;
public class Teste_Celula {
	
	public static void main(String[] args) {
		Lista x = new Lista();	
		x.queve(3);
		x.queve(5);
		x.queve(7);
		x.queve(10);
		x.dequeve();
		x.mostrar();
		
		if(x.isEmpty()) {
			System.out.println("Vazio!");
		}
		else {
			System.out.println("Preenchido!");
		}
		
		x.getTam();
		
	}
}
