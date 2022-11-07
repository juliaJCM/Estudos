//Atividade 07-11-2022
public class CelulaDupla {
	CelulaDupla ant, prox;
	int elemento;
	
	CelulaDupla() { //sentinela
		this(-1);
	}
	
	CelulaDupla(int elemento){
		this.elemento = elemento;
		ant = prox = null;
	}
}
