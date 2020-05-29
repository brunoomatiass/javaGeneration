package ex01;

public class Cachorro extends Veterinario {
	
	public Cachorro()
	{
		super("");
	}
	
	public void som (String somCachorro) {
		System.out.println("O cachorro late");
	}

	public void acao (String correCachorro) {
		System.out.println("O cachorro corre");
	}
	
	public void examinar(String reacao) {
		System.out.println("O cachorro latiu ao ser examinado pelo veterinario");
	}
	
	

}


