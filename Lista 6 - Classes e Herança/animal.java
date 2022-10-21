
public abstract class animal {

	private String nome;
	
	animal(String nome){
		this.nome = nome;
	}

	public abstract String fala();
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return this.nome;
	}

}
