//atividade 04 da lista do laborat�rio
import java.util.Scanner;
public class atividade04 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double sal, somaSal=0, maior=-1;
		int filhos, totalHab=0, somaFilhos=0;
		int quantBaixo=0;
		
		System.out.println("Digite o sal�rio(ou negativo para parar):");
		sal=ent.nextDouble();
		
		while(sal >= 0) {
			System.out.println("Digite a quantidade de filhos:");
			filhos=ent.nextInt();
			totalHab++;
			somaSal=somaSal+sal;
			somaFilhos=somaFilhos+filhos;
			
			if(sal > maior) {
				maior=sal;
			}
			if(sal<=100) {
				quantBaixo++;
			}
			System.out.println("Digite o sal�rio(ou nega��o para parar):");
			sal=ent.nextInt();
		}
			if (totalHab > 0) {
				System.out.println("A m�dia de sal�rios � R$"+(somaSal/totalHab));
				System.out.println("A m�dia de filhos �"+(somaFilhos/totalHab));
				System.out.println("O maior sal�rio � R$"+maior);
				System.out.println("O percentual �:"+(quantBaixo*100.0)/totalHab);
			}
		
ent.close();
	}

}
