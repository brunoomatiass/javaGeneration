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
		
		
		// CHAME OS M�TODOS PARA TESTAR A ACELRA��O E PARADA DOS VE�CULOS
				//gol.acelerar();
				//gol.parar();
				//hornet.acelerar();
				//hornet.parar();
		
		
	}
	
		
}
