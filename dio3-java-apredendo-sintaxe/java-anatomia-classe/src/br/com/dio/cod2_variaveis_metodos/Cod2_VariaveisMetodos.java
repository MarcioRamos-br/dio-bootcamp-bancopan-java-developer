package br.com.dio.cod2_variaveis_metodos;


// NOMEANDO VARIAVEIS E METODOS:

public class Cod2_VariaveisMetodos{

    public static void main(String[] args) {
        
        /*
        //DECLARANDO VARIAVEIS:
        // Estrutura 
        // Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
        // Exemplo:

        String meuNome = "Marcio"; // String ( caracteres )
        int anoFabricacao = 2022;  // Inteiro ( numeros inteiros )
        boolean varBoleana = true; // Boleana ( true ou false )

        // variaveis com escopo global: É possível mudar o valor após a declaração.

        anoFabricacao = 2018;

        */


        String primeiroNome = "Marcio";
        String segundoNome = "Ramos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    
        // SAIDA NO TERMINAL
        System.out.println("  " );
        System.out.println(nomeCompleto); // SAIDA COM VARIAVEL nomeCompleto recebendo o metodo nomeCompleto()
        System.out.println("  " );
       
       
    }// fechamento main

    // ================================================================================

    /* 
        // DECLARANDO METODOS
        // Estrutura
        // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
        // Exemplo:

        int somar (int numero1, int numero2){
        // EXEMPLO DE METODO COM ARGUMENTO COM TIPO IGUAL DO RETORNO   
        // PARAMETRO É A VARIAVEL QUE IRÁ RECEBER UM VALOR EM UM MÉTODO
        // ARGUMENTO É O VALOR QUE O USUARIO PASSA PARA O MÉTODO ( OU FUNÇÃO )
        
        // DECLARAR CORPO DO METODO


        }

        String formatarCep (long cep){
        // EXEMPLO DE METODO COM ARGUMENTO COM TIPO DIFERENTE DO RETORNO 
        // PARAMETRO É A VARIAVEL QUE IRÁ RECEBER UM VALOR EM UM MÉTODO
        // ARGUMENTO É O VALOR QUE O USUARIO PASSA PARA O MÉTODO ( OU FUNÇÃO )

        // DECLARAR CORPO DO METODO   

        }
        */

        public static String nomeCompleto(String primeiroNome, String segundoNome){
            return " Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);


        }



} // fechamento classe