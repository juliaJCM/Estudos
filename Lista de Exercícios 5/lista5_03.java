import java.util.Scanner; //atividade Rosilane - lista 5
public class lista5_03 {
	

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
		
		public static void valor(int [] x, int [] y) { //encontrar o posição impar
			int p = 0;
			int [] vet = new int [20]; 
			
			for(int i = 0; i < 19; i += 2) {
				vet [i] = x[p]; 
				vet [i+1] = y [p];
				p++;
			}
			result (vet);
	}
		
		public static void result(int [] mat) {
			System.out.println("O valor do vetor será: ");
			for(int i = 0; i < mat.length; i++) {
				System.out.print(" " + mat[i]);
			}
		}
		
		public static void main(String[] args) {
			Scanner ent = new Scanner(System.in);
			
			//variaveis 
			int [] x = new int [10];
			int [] y = new int [10];
			
			//chamando métodos
			proced(x,y);
			valor(x,y);
			
ent.close();
		}

	}

