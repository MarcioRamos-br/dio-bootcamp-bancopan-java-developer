package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private Integer idade;
	// atributos

	/*
	 * Esquema Manual para Criação de Construtores
	 * 
	 * public Gato(String nome, String cor, Integer idade ) { this.nome = nome;
	 * this.cor = cor; this.idade = idade;
	 * 
	 * 
	 * }
	 */

	// Esquema Prático para Criação de Construtores

	public Gato() {
	}
	// construtor vazio

	public Gato(String nome, String cor, Integer idade) {
		// construtor completo
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	// Esquema Prático para Criação de Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	// Esquema Prático para Criação de hashCode and Equals ( Pesquisar sobre )

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	// Esquema Prático para Criação de toString

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";

	}

}
