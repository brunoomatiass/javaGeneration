package ModeloAutomovel;

import java.util.Scanner;

public class ModeloAutomovel {
	
	String resp;
	int vel;
	int respVel;
	
	private String nome;
	private String marca;
	private String cor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void acelerar() {
		System.out.println("O automóvel vai passar por curvas? (s / n)");
		
		Scanner sc = new Scanner(System.in);
		resp = sc.nextLine();
		
		
		if (resp.equals("n")) {
			for(vel = 0; vel < 110; vel += 10)
				System.out.println(vel + "km/h");
				System.out.println();}
		
		else {
			for(vel = 0; vel <= 70; vel += 10 )
				System.out.println(vel + "km/h");
				if(vel > 70) {
					System.out.println("O automóvel capotou, pois passou na curva a mais de 70 km/h!");
				}
				
				System.out.println();
			 }
	sc.close();
	}
	
		
	public void parar () {
		
		System.out.println("Informe a velocidade do automóvel: ");
		
		Scanner sc = new Scanner(System.in);
		respVel = sc.nextInt();
		
		
		
		if(respVel > 0) {		
		
			for(int i = 0; respVel >= 0; respVel -= 10) {
			System.out.println(respVel + "km/h");
		}
			System.out.println("O automóvel parou!");
	}
		sc.close();
}
	
}
