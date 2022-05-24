package br.com.maria.domain.pessoa;

import java.util.List;

/**
 * Classe abstrata do tipo pessoa
 * @author ferreira.5903
 *
 */

public abstract class Pessoa {

	private String nome;
	
	private List<Endereco> endereco;
	
	public abstract void imprimir();
	
	public Pessoa() {
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/*
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the endereco
	 */
	public List<Endereco> getEndereco() {
		return endereco;
	}

	/*
	 * @param endereco the endereco to set
	 */
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	
}
