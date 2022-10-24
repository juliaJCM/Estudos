
public class Pilha {
	private int vetor[];
	private int tamanho;
	
	Pilha (){
		this(6);
	}
	
	Pilha (int x) {
		vetor = new int [x];
		tamanho = 0;
	}
	
	void inserirFim(int x) {
		if(tamanho == vetor.length) {
			System.out.println("Lista Cheia!");
		}
		else {
			vetor[tamanho] = x;
			tamanho ++;
		}
	}
	
	int removerFim() {
		int retornar = 0;
		if(tamanho == 0) {
			System.out.println("Lista vazia!");
		}
		else {
			retornar = vetor[tamanho];
			tamanho --;
		}
		return retornar;
	}
	
	void Mostrar() {
		if(tamanho == 0) {
			System.out.println("Lista vazia!");
		}
		else {
			for(int i = 0; i < tamanho; i++) {				
				System.out.print(vetor[i] + " ");
			}
			System.out.println();
		}
	}
	

}
