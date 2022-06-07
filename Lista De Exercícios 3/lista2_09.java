//atividade 09 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_09 { //Função 
	
	public static double notas(double nt, double aluno) {
		return (nt/aluno);
	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		 double num1;
		 double nt = 0;
		 double aluno = 0;
		 
		 System.out.println("Digite a nota do aluno: ");
		 num1 = ent.nextDouble();
		 
		 if (num1 >= 6 ) {
		 while (num1 >= 6) {
			 nt += num1; // nt = nt + num1
			 aluno++;
		 
			 System.out.println("Digite a nota do aluno: ");
			 num1 = ent.nextDouble();
		 }		 
	System.out.println("A média dos alunos será: " + notas(nt, aluno)); 
		 }
		 
		 else {
			 System.out.println("Nota menor que 5");
		 }
ent.close();
	}

}
