package pacote;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Lista {
	public static void imprimir(ArrayList<String>x) {
		for(int i = 0; i < x.size(); i++) {
		System.out.println(x.get(i));
	}
	}
	
	public static boolean pesquisa(ArrayList<String>x, String n) {
		Scanner ent1 = new Scanner(System.in);
		
		boolean retorna = false;
		int pesq = 0;
		
		while(pesq <= x.size()) {
			if(x.get(pesq).equals(n)) {
				retorna = true;
				pesq = x.size();
			}
			pesq ++;
		}
		
		return retorna;
	}
	
	public static boolean pesqBinariaIterativa(ArrayList<String>x, String n) {
		boolean retorna =  false;
		int dir = x.size()-1, esq = 0, meio;
		
		while(esq <= dir) {
			meio = (esq + dir)/2;
			
			if(x.get(meio).equals(n)) {
				retorna = true;
				esq = x.size();
			}
			
		}
	}
	
	public static void adiciona(ArrayList<String>x) {
		Scanner ent = new Scanner(System.in);
		String n = null;
		
		while(!"STOP".equals(n)) {
			System.out.println("Digite um nome ou escreva STOP para encerrar:");
			n = ent.nextLine();
			
			if(!"STOP".equals(n)) {
				x.add(n);
			}
		}
	}

	public static void main(String[] args) {
		Scanner ent1 = new Scanner(System.in);
		ArrayList<String> x = new ArrayList<String>();
		
		adiciona(x);
		
		imprimir(x);
		
		System.out.println("\nPesquise por um nome:");
		String n = ent1.nextLine();
		
		if(pesquisa(x, n)) {
			System.out.println("True");
		}
		
		
	}

}
