package collectionsExercicios;

public class Telefone {
	
	// ATRIBUTOS
	
	private String numTelefone;
	private int tipoTel; //0: res., 1: com., 2: cel.
	
	
	// CONSTRUTOR
		public Telefone(String tel, int tipo)
		{
		this.numTelefone = tel;
		this.tipoTel = tipo;
		}
	
	// GETTERS AND SETTERS


	public String getNumTelefone() 
		{
		return numTelefone;
		}

	public void setNumTelefone(String numTelefone)
		{
		this.numTelefone = numTelefone;
		}

	public int getTipoTel() 
		{
		return tipoTel;
		}

	public void setTipoTel(int tipoTel) 
		{
		this.tipoTel = tipoTel;
		}
	
}