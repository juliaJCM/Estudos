import java.util.Scanner; //atividade Rosilane - lista 5
public class lista5_01 {

	public static void notas(double [] alunos) {
		Scanner not = new Scanner(System.in);
		
		for(int pos=0; pos < 10; pos++) { //(pos = posi��o)
			System.out.println("Digite a notas dos alunos: ");
			alunos [pos] = not.nextDouble();
		}
	}
	
	public static void media(double [] alunos) {
		int total = 0;
		int aluno = 0;
		
		for(int pos=0; pos < 10; pos++) {
			total += alunos[pos];
		}
		total = total/10; // total /= 10
		System.out.println("A m�dia de notas dos alunos ser�: " + total);
		
		for(int pos=0; pos < 10; pos++) {
			if (alunos [pos] > total) {
				aluno++; //variavel de alunos que ficaram acima da m�dia
			}
		}
		System.out.println("A quantidade de alunos que ficou acima da m�dia ser�: " + aluno);
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//variaveis
		double [] alunos = new double [10];
		
		//chamando m�todos
		notas(alunos);
		media(alunos);
		
ent.close();
	}

}
