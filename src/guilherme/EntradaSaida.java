package guilherme;

public class EntradaSaida {
	private String entrada;
	private String saida;

	public EntradaSaida(){
		
	}
	public EntradaSaida(String entrada, String saida){
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	
}
