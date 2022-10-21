//17-10-2022
import java.util.Scanner;
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

	void queve(int elemento) {
		ult.prox = new Celula (elemento); //add um proximo elemento na lista
		ult = ult.prox;
		tam ++;
	}
	
	int dequeve() { 
		Celula tmp = prim.prox;
		int retorno = prim.prox.elemento;
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
			System.out.print(aux.elemento + " ");
			aux = aux.prox;
		}
	}

}
