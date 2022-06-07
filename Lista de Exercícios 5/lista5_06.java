import java.util.Scanner; //atividade Rosilane - lista 5
public class lista5_06 {

	public static void proced(int [][] a) { 
		Scanner ent = new Scanner(System.in); //sempre que precisar digitar valores, colocar o Scanner
		
		for (int ln = 0; ln < a.length; ln++) { //ln=linha
			for(int col = 0; col < a[0].length; col++) { //col=coluna
				System.out.println("Digite os valores: ");
				a [ln][col] = ent.nextInt();
			}
		}
	}
	
	public static void proced1(int [][] mat) { //letra A
		int [] linha1 = new int [10];
		int [] linha2 = new int [10];
		
		for (int col = 0; col < 10; col++) { //linha 2
			linha1 [col] = mat [1][col];
		}
		
		for (int col = 0; col < 10; col++) { //linha 8
			linha2 [col] = mat [7][col];
		}
		
		for (int col = 0; col < 10; col++) { 
			mat [1][col] = linha2 [col];
		}
		
		for (int col = 0; col < 10; col++) { 
			mat [7][col] = linha1 [col];
		}
	}
	
	public static void proced2(int [][] mat) { //letra B
		int [] col01 = new int [10];
		int [] col02 = new int [10];
		
		for (int ln = 0; ln < 10; ln++) { //linha 2
			col01 [ln] = mat [ln][3];
		}
		
		for (int ln = 0; ln < 10; ln++) { //linha 8
			col02 [ln] = mat [ln][9];
		}
		
		for (int ln = 0; ln < 10; ln++) { 
			mat [ln][3] = col02 [ln];
		}
		
		for (int ln = 0; ln < 10; ln++) { 
			mat [ln][9] = col01 [ln];
		}
	}
	
	public static void proced3(int [][] mat) { //letra C
		int [] diag1 = new int [10];
		int [] diag2 = new int [10];
		int col = 9;
		
		for (int ln = 0; ln < 10; ln++) { //diagonal principal
			diag1 [ln] = mat [ln][ln];
		}
		
		for (int ln = 0; ln < 10; ln++) { //diagonal secundária
			diag2 [ln] = mat [ln][col];	  
			col--;
		}
		
		for (int ln = 0; ln < 10; ln++) { 
			mat [ln][ln] = diag2 [ln];
		}
		
		col = 9; //variavel de coluna
		
		for (int ln = 0; ln < 10; ln++) { 
			mat [ln][col] = diag1 [ln];	  
			col--;
		}
	}
	
	public static void proced4(int [][] mat) { //letra D
		int [] linha = new int [10];
		int [] coluna = new int [10];
		
		for(int ln = 0; ln < 10; ln++) { //coluna
			coluna [ln] = mat [ln][9];
		}
		
		for (int col = 0; col < 10; col++) { //linha
			linha [col] = mat [4][col];
		}
		

		for(int ln = 0; ln < 10; ln++) { 
			mat [ln][9] = linha [ln];
		}
		
		for (int col = 0; col < 10; col++) { 
			mat [4][col] = coluna [col];
		}
	}
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//variaveis
		int [][] mat = new int [10][10];
		
		//chamando métodos
		proced(mat);
		
		for (int ln = 0; ln < 10; ln++) {
            for (int col = 0; col < 10; col++) {
                System.out.printf("%d ", mat[ln][col]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
		
      //chamando métodos
		proced1(mat);
		proced2(mat);
		proced3(mat);
		proced4(mat);
		
		for (int ln = 0; ln < 10; ln++) {
            for (int col = 0; col < 10; col++) {
                System.out.printf("%d ", mat[ln][col]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
		
ent.close();
	}

}
