package pacote;

public class ArvoreBinaria {
	private No raiz;

	public void ArvoreBi() {
		raiz = null;
	}

	No Raiz() {
		return raiz;
	}

	public void inserir(String nome, String telefone) throws Exception {
		raiz = insere(nome, telefone, Raiz());
	}

	No insere(String nome, String telefone, No x) throws Exception {
		if (x == null) {
			x = new No(nome, telefone);
		}

		else if (nome.compareTo(x.nome) < 0) {
			x.Esq = insere(nome, telefone, x.Esq);
		}

		else if (nome.compareTo(x.nome) > 0) {
			x.Dir = insere(nome, telefone, x.Dir);
		} 
		
		else {
			throw new Exception("Erro");
		}
		return x;

	}

	String buscar(String nome, No y) {
		String telefone;

		if (y == null) {
			telefone = null;
		}

		else if (y.nome.compareTo(nome) == 0) {
			telefone = y.telefone;
		}

		else if (nome.compareTo(y.nome) < 0) {
			telefone = buscar(nome, y.Esq);
		}

		else {
			telefone = buscar(nome, y.Dir);
		}

		return telefone;
	}

	String busca(String nome) {
		return buscar(nome, Raiz());
	}
	
	void caminhamentoCentral(No z) {
		if (z != null) {
			caminhamentoCentral(z.Esq);
			System.out.println("Nome:" + z.nome + " -- Telefone:" + z.telefone);
			caminhamentoCentral(z.Dir);
		}
	}
	
	void mostrar() {
		caminhamentoCentral(Raiz());
	}

}
