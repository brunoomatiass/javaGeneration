package Eletrodomesticos;

public class main {

	public static void main(String[] args) {
		
		ModelosEletrodomesticos modelo01 = new ModelosEletrodomesticos();
		modelo01.setMarca("Arno");
		modelo01.setTipo("Liquidificador");
		modelo01.setPreco(200);

		modelo01.descrever();
	}

}
