//Lista 7
public class Exercicio {

	public static void main(String[] args) {
		Lista x = new Lista();
		x.inserirInicio(2);
		x.Mostrar();
		x.inserirPos(4, 1);
		x.Mostrar();
		x.inserirFim(3);
		x.Mostrar();
		x.inserirInicio(1);
		x.Mostrar();
		x.inserirFim(3);
		x.Mostrar();
		
		x.removerInicio();
		x.Mostrar();
		x.removerPos(2);
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerInicio();
		x.Mostrar();
		x.removerPos(0);
		x.Mostrar();
		
		Pilha y = new Pilha();
		x.inserirFim(1);
		x.Mostrar();
		x.inserirFim(2);
		x.Mostrar();
		x.inserirFim(3);
		x.Mostrar();
		x.inserirFim(4);
		x.Mostrar();
		x.inserirFim(5);
		x.Mostrar();
		
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		
		Fila z = new Fila();
		x.inserirInicio(5);
		x.Mostrar();
		x.inserirInicio(4);
		x.Mostrar();
		x.inserirInicio(3);
		x.Mostrar();
		x.inserirInicio(2);
		x.Mostrar();
		x.inserirInicio(1);
		x.Mostrar();
		
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
		x.removerFim();
		x.Mostrar();
	}

}