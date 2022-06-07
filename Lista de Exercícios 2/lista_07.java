//lista de atividades da Rosilane - 28/04
import java.util.Scanner;
public class lista_07 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//variáveis utilizadas
		int opcao = 1;		
		double cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, op5 = 0, op6 = 0;
		
		while (opcao > 0) {
			
			System.out.print("Escolha seu voto: \n 1- Canditato1 \n 2- Candidato2 \n 3- Candidato3 \n 4- Candidato4 \n 5- Voto Nulo \n 6-Voto em Branco \n 0- parar \n");
			opcao = ent.nextInt();
			//switch foi utilizado como método para escolher uma opção e assim contabiliza-las 
			switch (opcao) {
			
			case 1: cand1++;
				break;
				
			case 2: cand2++;
				break;
				
			case 3: cand3++;
				break;
				
			case 4: cand4++;
				break;
				
			case 5: op5++;
				break;
				
			case 6: op6++;
				break;		
			}
		}
		System.out.println("Total de votos candidato 1:" +cand1);
		System.out.println("Total de votos candidato 2:" +cand2);
		System.out.println("Total de votos candidato 3:" +cand3);
		System.out.println("Total de votos candidato 4:" +cand4);
		
		System.out.println("Total de votos nulos é:" +op5);
		System.out.println("Total de votos em branco é:" +op6);
		
ent.close();		
	}

}
