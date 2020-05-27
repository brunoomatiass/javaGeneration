package ModeloAutomovel;

public class Carro extends ModeloAutomovel {

	private String tipo;
	private boolean quatroRodas = true;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isQuatroRodas() {
		return quatroRodas;
	}
	public void setQuatroRodas(boolean quatroRodas) {
		this.quatroRodas = quatroRodas;
	}
	
	
	
	public void descrever() {
		
	
		
		System.out.println("Descrição do carro:");
		System.out.println(super.getNome());
		System.out.println(super.getMarca());
		System.out.println(super.getCor());
		System.out.println(this.getTipo());
		System.out.println(this.isQuatroRodas());
		System.out.println();
	}
	
	
}
