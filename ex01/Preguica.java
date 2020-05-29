package ex01;

public class Preguica extends Veterinario {

	public Preguica()
	{
		super("");
	}
	
	public void som (String somPreguica) {
		System.out.println("A preguiça faz um barulho estranho.");
	}

	public void acao (String sobeArvore) {
		System.out.println("A preguiça sobe na árvore.");
	}
	
	public void examinar(String reacao) {
		System.out.println("A preguiça fez um barulho ao ser examinada pelo veterinario.");
	}
	
	
}
