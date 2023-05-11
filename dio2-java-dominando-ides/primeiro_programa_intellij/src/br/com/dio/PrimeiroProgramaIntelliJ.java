package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaIntelliJ {
    public static void main(String[] args) {
       /* int a = 2;
        int b = 3;
        int resultado = a + b ;

        System.out.println("Hello Word!!!");
        System.out.println("A Soma de 2 + 3 = " + resultado );*/

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O Problema dos 3 Corpos", 300);
        System.out.println(livro1);



    }


    static class Livro {
        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }


        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }


}//fechamento main
