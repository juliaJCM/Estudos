package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] vetorOriginal = new int[6];
		int i;

		// PREENCHIMENTO E LEITURA DE VETOR
		for (i = 0; i < vetorOriginal.length; i++) {
			vetorOriginal[i] = i;

			System.out.println("Digite um valor para a " + i + " posição:");
			vetorOriginal[i] = ent.nextInt();
			System.out.print(vetorOriginal[i]);
		}

		// POSIÇÕES INVERTIDAS
		int tamVetorOriginal = vetorOriginal.length;
		int[] aux = new int[tamVetorOriginal];

		for (i = 0; i < tamVetorOriginal; i++) {
			aux[i] = vetorOriginal[tamVetorOriginal - 1] - i;

		}
		System.out.print(aux[i]);

		ent.close();
	}

}
