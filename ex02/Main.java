package ex02;

public class Main {

	public static void main(String[] args) {
		
		CarroPasseio ferrari = new CarroPasseio();
		Caminhao mercedez = new Caminhao();
		
		ferrari.entrPass("f350", "amarelo");
		ferrari.entrVeic("esportivo", 600, 400);
		
		ferrari.mostrarVeic();
		ferrari.mostrPass();
		
		System.out.println();
		
		mercedez.entrCamn(10000, 2, 11);
		mercedez.mostrarCamn();
		
	}

}
