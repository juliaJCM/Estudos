import java.util.Scanner; //atividade Rosilane - lista 5
public class lista5_05 {
	
	public static void proced(int [][] a, int [][] b) { 
		Scanner ent = new Scanner(System.in); //sempre que precisar digitar valores, colocar o Scanner
		
		for (int ln = 0; ln < a.length; ln++) { //ln=linha
			for(int col = 0; col < a[0].length; col++) { //col=coluna
				System.out.println("Digite os valores: ");
				a [ln][col] = ent.nextInt();
			}
		}
		
		for (int ln = 0; ln < b.length; ln++) { //ln=linha
			for(int col = 0; col < b[0].length; col++) { //col=coluna
				System.out.println("Digite os valores: ");
				b [ln][col] = ent.nextInt();
			}
		}
	}
	
	public static int [][] funcA(int [][] a, int [][] b, int [][] S) { //letra A
		
		for (int ln = 0; ln < S.length; ln++) { //ln=linha
			for(int col = 0; col < S[0].length; col++) { //col=coluna
				S [ln][col] = a[ln][col] + b[ln][col];
			}
		}
		return S;
	}
	
	public static int [][] funcB(int [][] a, int [][] b, int [][] ST) { //letra B
		
		for (int ln = 0; ln < ST.length; ln++) { //ln=linha
			for(int col = 0; col < ST[0].length; col++) { //col=coluna
				ST [ln][col] = a[ln][col] - b[ln][col];
			}
		}
		return ST;
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int [][] valorA = new int [4][6];
		int [][] valorB = new int [4][6];
		int [][] SomaA = new int [4][6];
		int [][] SubB = new int [4][6];
		
		//chamando métodos
		proced(valorA, valorB);
		funcA(valorA, valorB, SomaA);
		funcB(valorA, valorB, SubB);
		
		for (int ln = 0; ln < valorA.length; ln++) { //ln=linha
			for(int col = 0; col < valorA[0].length; col++) { //col=coluna
				System.out.println("a) O valor será: " + SomaA[ln][col]);
			}
		}
		
		for (int ln = 0; ln < valorA.length; ln++) { //ln=linha
			for(int col = 0; col < valorA[0].length; col++) { //col=coluna
				System.out.println("b) O valor será: " + SubB[ln][col]);
			}
		}
		
ent.close();		
	}

}
