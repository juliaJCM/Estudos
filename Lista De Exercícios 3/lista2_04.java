//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_04 { //Procedimento 
	
	public static void trian(double x,double y,double z) {
			//os lados x,y,z devem ser maiores que zero, caso contrário não será um triângulo
			if (x > 0 && y > 0 && z > 0 && (x < y + z) && (y < x + z) && (z < x + y)) {
				if (x == y && x == z) {
					System.out.println("Triângulo Equilátero");
				}
				
				else if (x == y || x == z || y == z) {
					System.out.println("Triângulo Isóceles");
				}
				
				else {
					System.out.println("Triângulo Escaleno");
				}	
			}
			
			else {
				System.out.println("Não é triângulo");
			}
			
		}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//variáveis usadas
		double x, y, z;
		
		System.out.println("Digite os valores dos lados do triângulo: ");
		x = ent.nextDouble();
		y = ent.nextDouble();
		z = ent.nextDouble();
		
		trian(x, y, z);
		
ent.close();
	}

}
