package Aeronaves;

public class main {

	public static void main(String[] args) {
		
	AeronavesModel aeronave01 = new AeronavesModel();
	aeronave01.setModelo("Boing");
	aeronave01.setTipo("Aeronave Comercial");
	aeronave01.setVelMax(1000);
	
	aeronave01.descrever();
	aeronave01.decolar();
	aeronave01.pousar();
	

	}

}
