package collectionsExercicios;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class codigoComentado01 {
    public static void main(String[] args) { // Declara que é a classe publica, voltada para a execução
        List<Integer> minhaLista = new ArrayList<Integer>(); // declara um ArrayList do tipo inteiro, cria um novo objeto desta classe
        minhaLista.add(1); //adiciona informação ao vetor
        minhaLista.add(2);
        minhaLista.add(2);
 
        for (Integer listaElementos : minhaLista) { //for each de item da lista
            System.out.println(listaElementos); // imprime cada item da lista
        }
        Set<Integer> meuSet = new HashSet<Integer>();// iniciaum array do tipo Set/HashSet, como numeros inteiros
        meuSet.add(1);
        meuSet.add(2);//impede a inclusão de números repitidos
        meuSet.add(3);
        meuSet.add(1);
        Iterator<Integer> iMeuSet = meuSet.iterator();//localiza toda a lista meuSet
        while(iMeuSet.hasNext()){// laço de repetição com V ou F, imprimi os numeros enqaunto existirem novos valores a serem impressos
            System.out.println(iMeuSet.next());
        }
 
 
 
    }
 
}


