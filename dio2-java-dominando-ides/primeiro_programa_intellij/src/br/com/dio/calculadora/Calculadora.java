package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println(" Digite o Primeiro Valor");
        a = scanner.nextInt();

        System.out.println(" Digite o Segundo Valor");
        b = scanner.nextInt();

        // Chamando os metodos, e criando variaveis para receber os retornos.
        // Ex.: soma(a, b) // Atalho "Comand+Alt+V" cria variáveis locais
        // para receber 0 retorno dos métodos da calculadora.
        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        int divisao = divisao(a, b);

        //Saida com o retorno de cada metodo

        System.out.println("soma = " + soma);
        System.out.println("subtracao = " + subtracao);
        System.out.println("multiplicacao = " + multiplicacao);
        System.out.println("divisao = " + divisao);



    } // fechamento metodo manin

    // Declaração dos métodos para as funções principais da Calculadora.

    public static int soma( int a, int b){
        return a + b ;

    } public static int subtracao( int a, int b){
            return a - b ;
    }

    public static int multiplicacao( int a, int b){
        return a * b ;
    }

    public static int divisao( int a, int b){
    return a / b ;
    }






} //fechamento classe Calculadora
// fazer push dessa ultima classe Calculadora
// com o aviso "primeiro programa IntelliJ
//(add classe - Calculadora )