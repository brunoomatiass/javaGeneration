package ModeloAutomovel;

public class main {

	public static void main(String[] args) {
		
		Carro gol = new Carro();
		
		gol.setNome("Gol");
		gol.setMarca("Volkswagen");
		gol.setCor("preto");
		gol.setTipo("carro");
				
		
		gol.descrever();
		
		
		Moto hornet = new Moto();
		
		hornet.setNome("Hornet");
		hornet.setMarca("Honda");
		hornet.setCor("amarelo");
		hornet.setTipo("moto");
		hornet.setCilindradas(800);
		
		hornet.descreverMoto();
		
		
		// CHAME OS MÉTODOS PARA TESTAR A ACELRAÇÃO E PARADA DOS VEÍCULOS
				//gol.acelerar();
				//gol.parar();
				//hornet.acelerar();
				//hornet.parar();
		
		
	}
	
		
}
