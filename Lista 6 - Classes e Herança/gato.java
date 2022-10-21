
public class gato extends animal {
	
	String fala = "Miau";
	
	public gato (String nome) {
		super(nome);
	}

	@Override
	public String fala() {
		return this.fala;	
	}
	
	public void setFala(String mudar) {
		this.fala = mudar;
	}
	public String getFala() {
		return this.fala;
	}
	

}
