package ex02;

abstract public class Veiculo {

	//ATRIBUTOS

	protected String tipo;
	protected int peso;
	protected int velocMax;

	//GETTERS AND SETTERS

	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}
	
	
	
	//MÉTODOS
	public void entrVeic (String tipo, int peso, int velocMax)
		{
		this.tipo = tipo;
		this.peso = peso;
		this.velocMax = velocMax;
		}
	
	public void mostrarVeic() 
		{
		System.out.println("Tipo: " + this.tipo +" Velocidade Máxima: " + this.velocMax + "km/h" + " Peso: " + this.peso + " kg");
		}
	
}