
public class Lista {
	private int vetor[];
	private int tamanho;
	
	Lista (){
		this(6);
	}
	
	Lista (int x) {
		vetor = new int [x];
		tamanho = 0;
	}
	
	//Inserção Início
	void inserirInicio (int x) {	
		if(tamanho == vetor.length) {
			System.out.println("Vetor cheio!");
		}
		else {
			for( int i = tamanho; i > 0; i--) {
				vetor[i] = vetor [i-1];
			}
			vetor[0] = x;
			tamanho ++;
		}	
	}
	
	//Inserção Fim
	void inserirFim(int x) {
		if(tamanho == vetor.length) {
			System.out.println("Lista Cheia!");
		}
		else {
			vetor[tamanho] = x;
			tamanho ++;
		}
	}
	
	//Inserção Posição
	void inserirPos(int x, int pos) {
		if (tamanho == vetor.length) {
			System.out.println("Lista cheia!");			
		}
		else if(pos > vetor.length || pos < 0) {
			System.out.println("Posi��o inv�lida");
		}
		else {
			for(int i = tamanho; i > pos; i--) {
				vetor[i] = vetor[i-1];
			}
			vetor[pos] = x;
			tamanho ++;
		}
	}
	
	//Remover Inicio
	int removerInicio() {
		int retornar = 0;
		if(tamanho == 0) {
			System.out.println("Lista vazia!");
		}
		else {
			retornar = vetor[0];
			tamanho --;
			
			for (int i = 0; i < tamanho; i++) {
				vetor[i] = vetor[i+1];
			}
		}
		return retornar;
		
	}
	
	//Remover Fim
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
	
	//Remover Posição
	int removerPos(int pos) {
		int retornar = 0;
		if(tamanho == 0) {
			System.out.println("Lista vazia!");
		}
		else {
			retornar = vetor[pos];
			tamanho --;
			
			for(int i = pos; i < tamanho; i++) {
				vetor[i] = vetor[i+1];
			}
		}
		return retornar;
	}
	
	//Mostrar Lista
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