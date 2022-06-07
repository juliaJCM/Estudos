import java.util.Scanner; //atividade Rosilane - lista 5
public class lista5_04 {
	
	public static void proced(int [][] mat) { //procedimento
		Scanner ent = new Scanner(System.in); //sempre que precisar digitar valores, colocar o Scanner
		
		for (int ln = 0; ln < mat.length; ln++) { //ln=linha
			for(int col = 0; col < mat[0].length; col++) { //col=coluna
				System.out.println("Digite os valores: ");
				mat [ln][col] = ent.nextInt();
			}
		}
	}
	
	public static int funcA(int [][] mat) { //letra A
		int soma = 0;
		
		for(int col = 0; col < mat[0].length; col++) {
			soma += mat[3][col];
		}
		return soma;
	}
	
	public static int funcB(int [][] mat) { //letra B
		int soma = 0;
		
		for(int ln = 0; ln < mat[0].length; ln++) {
			soma += mat[ln][1];
		}
		return soma;
	}
	
	public static int funcC(int [][] mat) { //letra C
		int soma = 0;
		
		for(int diag = 0; diag < mat.length; diag++) {
			soma += mat [diag][diag];
		}
		return soma;
	}
	
	public static int funcD(int [][] mat) { //letra D
		int soma = 0;
		int linha = 0;
		
		for(int col = 4; col >= 0; col--) {
			soma += mat [linha][col];
			linha++;
		}
		return soma;
	}
	
	public static int funcE(int [][] mat) { //letra E
		int soma = 0;
		
		for (int ln = 0; ln < mat.length; ln++) { //ln=linha
			for(int col = 0; col < mat[0].length; col++) { //col=coluna
				soma += mat [ln][col];
			}
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//variaveis
		int [][] valor = new int [5][5];
		
		//chamando métodos
		proced(valor);
		
		System.out.println("a) O valor será: "	+ funcA(valor));
		
		System.out.println("b) O valor será: "	+ funcB(valor));
		
		System.out.println("c) O valor será: "	+ funcC(valor));
		
		System.out.println("d) O valor será: "	+ funcD(valor));
		
		System.out.println("e) O valor será: "	+ funcE(valor));
		
		
		
ent.close();
	}

}
