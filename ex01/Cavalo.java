package ex01;

public class Cavalo extends Veterinario{
	
	
	public Cavalo()
		{
			super("");
		}
	
	public void som (String somCavalo) {
		System.out.println("O cavalo relincha.");
	}

	public void acao (String correCavalo) {
		System.out.println("O cavalo corre.");
	}

	public void examinar(String reacao) {
		System.out.println("O cavalo relinchou ao ser examinado pelo veterinario");
	}
		
}
