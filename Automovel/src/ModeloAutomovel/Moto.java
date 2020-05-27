package ModeloAutomovel;

public class Moto extends ModeloAutomovel {
	private String tipo;
	private boolean duasRodas = true;
	private int cilindradas;
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isDuasRodas() {
		return duasRodas;
	}
	public void setDuasRodas(boolean duasRodas) {
		this.duasRodas = duasRodas;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	
	public void descreverMoto() {
		
	
		
		System.out.println("Descrição da moto:");
		System.out.println(super.getNome());
		System.out.println(super.getMarca());
		System.out.println(super.getCor());
		System.out.println(this.getTipo());
		System.out.println(this.duasRodas);
		System.out.println(this.cilindradas);
		System.out.println();
	}
	
	
}
