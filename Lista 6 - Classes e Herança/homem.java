
public class homem extends animal {
	
	String fala = "Oi";
	
	public homem (String nome) {
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
