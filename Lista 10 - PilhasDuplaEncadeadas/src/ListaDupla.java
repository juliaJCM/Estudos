//Atividade 07-11-2022
public class ListaDupla {
	CelulaDupla prim, ult;
	int tamanho;
	
	ListaDupla(){
		prim = new CelulaDupla();
		ult = prim;
		tamanho = 0;
	}
	
	void inserirInicio(int elemento) {
		CelulaDupla aux = new CelulaDupla(elemento);
		aux.prox = prim.prox;
		aux.ant = prim;
		prim.prox = aux;
		tamanho ++;
		
		if(prim == ult) {
			ult = ult.prox;
		}
		else {
			aux.prox.ant = aux;
		}
		aux = null;
	}
	
	int removerInicio() {
		int elemento = prim.prox.elemento;
		CelulaDupla aux = prim.prox;
		prim.prox = prim.prox.prox;
		aux.prox = null;

		if(aux != ult) {
			prim.prox.ant = prim;
		}
		else {
			prim = ult;
		}
		
		aux.ant = null;
		aux = null;
		
		return elemento;
	}
}
