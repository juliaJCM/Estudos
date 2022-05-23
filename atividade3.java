import java.util.Scanner;
public class atividade3 {

	public static void proced(int [] x, int [] y) { 
		Scanner ent = new Scanner(System.in);
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Digite os valores:");
			x [i] = ent.nextInt();
		}
		
		for(int i = 0; i < y.length; i++) {
			System.out.println("Digite os valores:");
			y [i] = ent.nextInt();
		}
	}
	
	public static void valor(int [] x, int [] y) { //encontrar o numero impar
		int p = 0;
		int [] z = new int [20]; 
		
		for(int i = 0; i<20; i++) {
			if(x[p] %2 == 0) {
				z [i] = x [p];
				p++;
			}
			else {
				p++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int [] x = new int [10];
		int [] y = new int [10];
		
		proced(x,y);
		
		
ent.close();
	}

}
