package ex02;

public class CarroPasseio extends Veiculo {
	
	
	//	ATRIBUTOS
	
	private String modelo;
	private String cor;
	
	
	
	// GETTERS AND SETTERS
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	// MÉTODOS
	
	public void entrPass (String modelo, String cor) {
		this.cor = modelo;
		this.modelo = cor;
	}
	
	public void mostrPass () {
		System.out.println("Modelo: " + modelo + " Cor: " + cor);
	}
	
		
}
	
	
	

