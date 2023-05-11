package br.com.dio;

import br.com.dio.model.Gato; // importado da classe externa Gato

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*
		int a = 2;
		int b = 3;
		
		System.out.println("Hello Word!" + (a+b));
		*/
		
		Gato gato = new Gato();
	    Livros livros = new Livros();
	    
	    System.out.println(gato);
	    // resultado sera nulo
	    
	    System.out.println(livros);
	    // resultado sera apenas um endereco na memoria
	    
		
	}

}





/* Apenas como teste vamos criar uma nova Classe
fora do programa principal, assim veremos, que esta classe nao precisa
ser importada, mas foi construida dentro do mesmo arquivo do Programa.
*/

class Livros {
	private String nome;
	private String npag;
	
}

// PrimeiroPrograma feito na IDE Eclipse
//
