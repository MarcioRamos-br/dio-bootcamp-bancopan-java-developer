package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o Primeiro Valor");
		a = scan.nextInt();
		
		System.out.println("Digite o Segundo Valor");
		b = scan.nextInt();
		
		
		int soma = soma(a, b);// aqui sobre a plavra "soma" utilizar o comando: "Comand+1", e escolher a opçao " 
        // Assign statement to new local variable ("Comand+1+L")

		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		int divisao = divisao(a, b);
		
		
		System.out.println("soma = " + soma);
		System.out.println("subtracao = " + subtracao);
		System.out.println("multiplicacao = " + multiplicacao);
		System.out.println("divisao = " + divisao);
		
		scan.close();
		
	} // fechamento metodo main
	
	
	
	public static int soma (int a, int b) {
	
			return a+b;	
	}
	
	public static int subtracao (int a, int b) {
		
		return a-b;	
	}
	
	public static int multiplicacao (int a, int b) {
		
		return a*b;	
	}
	
	public static int divisao (int a, int b) {
		
		return a/b;	
	}
	
	
}// fechamento Calculadora
//
	
	
	
	
	


