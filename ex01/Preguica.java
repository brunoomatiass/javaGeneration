package ex01;

public class Preguica extends Veterinario {

	public Preguica()
	{
		super("");
	}
	
	public void som (String somPreguica) {
		System.out.println("A pregui�a faz um barulho estranho.");
	}

	public void acao (String sobeArvore) {
		System.out.println("A pregui�a sobe na �rvore.");
	}
	
	public void examinar(String reacao) {
		System.out.println("A pregui�a fez um barulho ao ser examinada pelo veterinario.");
	}
	
	
}
