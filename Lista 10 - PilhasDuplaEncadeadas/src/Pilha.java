//Atividade 07-11-2022
public class Pilha {
	CelulaP topo;
	int tamanho;
	
	Pilha(){
		topo = null;
		tamanho = 0;
	}
	
	void empilha(int elemento) {
		CelulaP aux = new CelulaP(elemento);
		aux.prox = topo;
		topo = aux;
		aux = null;
		tamanho ++;
	}
	
	int desempilha() {
		int elemento = topo.elemento;
		CelulaP aux = topo;
		topo = topo.prox;
		aux.prox = null;
		aux = null;
		tamanho --;
		return elemento;
	}
	
	void mostrar() {
		CelulaP aux = topo;
		
		while(aux != null) {
			System.out.println(aux.elemento);
			aux = aux.prox;
		}
	}
	
	void printTamanho() {
		System.out.println("O tamanho da pilha: " + tamanho);
	}
	
	void pilhaVazia() {
		if(tamanho == 0) {
			System.out.println("Pilha está vazia!");
		}
		else {
			System.out.println("Pilha NÃO está vazia!");
		}
	}
	
}


