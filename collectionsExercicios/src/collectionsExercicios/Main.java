package collectionsExercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Telefone num01 = new Telefone("5666-8888", 0);
		Telefone num02= new Telefone("5663-9999", 1);
		Telefone num03 = new Telefone("5868-7777", 2);		
		
		List<Telefone> lista = new ArrayList<>();
		
		lista.add(num01);
		lista.add(num02);
		lista.add(num03);
				
		Iterator<Telefone> itr = lista.iterator();
			
		while(itr.hasNext()) 
		{
		System.out.println(itr.next().getNumTelefone());
		}
	}
}
