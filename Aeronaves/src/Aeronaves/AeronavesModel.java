package Aeronaves;

public class AeronavesModel {
	private String tipo;
	private String modelo;
	private int velMax;


	
public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getVelMax() {
		return velMax;
	}



	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}


public void descrever() {
	getTipo();
	getModelo();
	getVelMax();
	System.out.println("Descrição da aeronave --- Modelo: " + this.modelo + "   Tipo: " + this.tipo
			+ "   Velocidade Máxima: " + this.velMax + " km/h." );
	System.out.println();
	}
	
public void decolar() {
	getModelo();
	System.out.println("O " + this.modelo + " decolou!");
	System.out.println();
	}

public void pousar() {
	getModelo();
	System.out.println("O " + this.modelo + " pousou!");
	System.out.println();
	}

}