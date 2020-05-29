package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguica preguica = new Preguica();
	Animal animal = null;
	
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Informe o animal (digite o numero correspondente): ");
	System.out.println("0  cachorro");
	System.out.println("1  cavalo");
	System.out.println("2  preguiça");
	
	int escolha = sc.nextInt();
	sc.close();
	
	switch (escolha) {
	
	case 0: animal = cachorro; break;
	case 1: animal = cavalo; break;
	case 2: animal = preguica; break;
	default: System.out.println("Erro na execução! informe um valor aceito.");
	
	}
	System.out.println();
	
	if (animal != null){
		animal.acao("");
		animal.som("");
		animal.examinar("");
	}

	
	}
	

}
