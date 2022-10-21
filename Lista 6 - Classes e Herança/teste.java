import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		gato [] cat = new gato[5];
		cao [] dog = new cao[5];
		homem [] man = new homem[5];
		
		for(int i= 0; i < 5; i++) {
			System.out.println("Escreva um nome - Homem: ");
			name = sc.nextLine();
			man[i] = new homem(name);
		}
		
		for(int i= 0; i < 5; i++) {
			System.out.println("Escreva um nome - Cão: ");
			name = sc.nextLine();
			dog[i] = new cao(name);
		}
		
		for(int i= 0; i < 5; i++) {
			System.out.println("Escreva um nome - Gato: ");
			name = sc.nextLine();
			cat[i] = new gato(name);
		}
		
		for(int i= 0; i < 5; i++) {
		System.out.println(man[i].getName() + " : " + man[i].getFala());
		System.out.println(dog[i].getName() + " : " + dog[i].getFala());
		System.out.println(cat[i].getName() + " : " + cat[i].getFala());
		}
		
	sc.close();
	}

}
