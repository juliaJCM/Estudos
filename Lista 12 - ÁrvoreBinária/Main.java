package pacote;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner ent = new Scanner(System.in);
		String [] linha;
		File arq = new File("C:\\Users\\julia\\OneDrive\\Documentos\\agenda.txt");
		
		try {
			ArvoreBinaria arv = new ArvoreBinaria();
			Scanner arquivo = new Scanner(arq);
			
			while(arquivo.hasNextLine()) {
				String linha1 = arquivo.nextLine();
				linha = linha1.split(" # ");
				arv.inserir(linha[0], linha[1]);
			}
			
			System.out.println("Busque por um nome: ");
			String nome = ent.nextLine();
			
			if(arv.busca(nome) != null) {
				System.out.println("N�mero encontrado: " + arv.busca(nome));
			}
			
			else {
				System.out.println("Nome N�O encontrado!");
			}
			
			System.out.println("\n--Lista Completa--");
			arv.mostrar();
			arquivo.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Arquivo N�O encontrado!");
			
			e.printStackTrace();
		}
		
		ent.close();
	}
}

