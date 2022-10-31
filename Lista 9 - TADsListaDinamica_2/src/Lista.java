
public class Lista {
	public Celula prim;
	public Celula ult;
	int tam;
	
	Lista(){
		prim = new Celula();
		ult = prim;
		tam = 0;		
	}
	
	void getTam( ) {
		System.out.println(tam);
		
	}
	
	boolean isEmpty() {
		if(prim.prox == null) {
			return true;
		}
		return false;
	}

	void inserirFim(Celula x) {
		ult.prox = x;
		ult = ult.prox;
		tam ++;
	}
	
	void inserirInicio(Celula x){
		x.prox = prim.prox;
		prim.prox = x;
		tam ++;
	}
	
	int removerInicio() { 
		Celula tmp = prim.prox;
		int retorno = prim.prox.idade;
		prim.prox = prim.prox.prox;
		tmp.prox = null;
		tmp = null;
		
		if(prim.prox == null) {
			ult = prim;
		}
		
		tam --;
		return retorno;
	}	
	
	void mostrar( ) {
		Celula aux = prim.prox;
		
		while(aux != null) {
			System.out.print(aux.nome + " - " + aux.idade + "  \n");
			aux = aux.prox;
		}
	}
	
	double funcaoIterat() {
		Celula aux = prim.prox;
		
		double med = 0;
		
		while(aux != null) {
			med += aux.idade;
			aux = aux.prox;
		}
		return med/4;
	}

}
