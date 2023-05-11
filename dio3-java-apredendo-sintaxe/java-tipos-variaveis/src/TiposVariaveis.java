public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    // java-tipos-variaveis - tipos primitivos/constantes




    // TIPO STRING
    String meuNome = "Marcio Ramos";
    
    
    
    
    // TIPO DOUBLE EM JAVA
    // CONVEÇÃO AMERICANA PARA REPRESENTAÇÃO DE MILHAR
    // EXEMPLO:


    double salarioMinimo1 = 2.5;  // Representação de Ponto FLutante "2,5".
    
    double salarioMinimo2 = 2500.33; // Representação de Milhar
                                    //( sem "Ponto").
                                    // Representação dos Centavos
                                    //( "Ponto" no Lugar da "Virgula").


    // JAVA É FORTEMENTE TIPADO

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    //short numeroCurto2 = numeroNormal;
    // ( ERRO: NAO É POSSIVEL CONVERTER INT PARA SHORT)

    short numeroCurto2 = (short) numeroNormal;
    // SOLUÇÃO: O SISTEMA SUGERIU 2 POSSIVEIS SOLUCOES.
    // 1 - AO INVÉS DE USAR "SHORT" UTILIZAR "INT".
    // 2 - FAZER A CONVERSÃO "CAST"( FOI A UTILZADA NO EXEMPLO ACIMA).


    // CONSTANTE
    // UMA VARIAVEL NORMAL PODE TER SEU VALOR ALTERADO DURANTE O CODIGO
    // EX.:
    /*
     int numero = 1;
     numero = 2;
     
    Já as Constantes são valores armazenados em memória que não podem ser modificados
    depois de declarados. Em Java, esses valores são representados pela palavra reservada
    final, seguida do tipo.
    Por convenção, Constantes são sempre escritas em CAIXA ALTA.
    EX.:
    */
    final double VALOR_DE_PI = 3.14;
    // VALOR_DE_PI=3.15;    //Esta linha vai apresentar erro de compilação!   
   


        System.out.println("Exemplo Saída: Hello World!");
        System.out.println("Exemplo Saída / String: " + meuNome);
        System.out.println("Exemplo Saída / Ponto Flutuante: "+ salarioMinimo1); 
        System.out.println("Exemplo Saída / Milhar: "+ salarioMinimo2); 
        System.out.println("Exemplo Saída / Fortemente Tipado (Cast = Int para Short): "+ numeroCurto2);
        System.out.println("Exemplo Saída / Constante: " + VALOR_DE_PI);   
    }
}
