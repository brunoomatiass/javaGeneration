package Eletrodomesticos;


public class ModelosEletrodomesticos {
	private String marca;
	private String tipo;
	private int preco;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
	public void descrever() {
		System.out.println("Descrição do eletrodoméstico:");
		getMarca();
		System.out.println(this.marca);
		getTipo();
		System.out.println(this.tipo);
		getPreco();
		System.out.println("R$ " + this.preco + ",00");
		System.out.println();
	}
	
	
}
