//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_04 { //Procedimento 
	
	public static void trian(double x,double y,double z) {
			//os lados x,y,z devem ser maiores que zero, caso contr�rio n�o ser� um tri�ngulo
			if (x > 0 && y > 0 && z > 0 && (x < y + z) && (y < x + z) && (z < x + y)) {
				if (x == y && x == z) {
					System.out.println("Tri�ngulo Equil�tero");
				}
				
				else if (x == y || x == z || y == z) {
					System.out.println("Tri�ngulo Is�celes");
				}
				
				else {
					System.out.println("Tri�ngulo Escaleno");
				}	
			}
			
			else {
				System.out.println("N�o � tri�ngulo");
			}
			
		}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//vari�veis usadas
		double x, y, z;
		
		System.out.println("Digite os valores dos lados do tri�ngulo: ");
		x = ent.nextDouble();
		y = ent.nextDouble();
		z = ent.nextDouble();
		
		trian(x, y, z);
		
ent.close();
	}

}
