
public class Celula {

	public String nome;
	public int idade;
	public Celula prox;
	
	Celula () {
		this("Desconhecido", 0);
	}
	
	Celula (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		prox = null;
	}

		

}