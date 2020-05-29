package ex01;

public abstract class Animal {
	
	protected String nome;
	protected int idade;
	
	
	abstract public void examinar(String reacao);

	abstract public void acao (String correOuSobe);
	
	abstract public void som (String emitirSom); 
	
	public Animal(String nome) {this.nome = nome;}
}
