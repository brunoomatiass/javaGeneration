package ex02;

public class Caminhao extends Veiculo{

	//	ATRIBUTOS
	
	private int cargaMax;
	private int alturaMax;
	private int comprimento;
	
	
	//	GETTERS AND SETTERS
	
	public int getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	//	MÉTODOS
	
	public void entrCamn (int peso, int altura, int comprimento) {
		this.cargaMax = peso;
		this.alturaMax = altura;
		this.comprimento = comprimento;
	}
	
	
	public void mostrarCamn () {
		System.out.println("Caminhão:");
		System.out.println("Carga máxima: " + this.cargaMax + " kg"+ " Altura maxima: "
		+ this.alturaMax + "m " + " Comprimento: " + this.comprimento + " m.");
	}
	
}
