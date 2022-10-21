
public class cao extends animal {

	String fala = "Au Au";
	
	public cao (String nome) {
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
