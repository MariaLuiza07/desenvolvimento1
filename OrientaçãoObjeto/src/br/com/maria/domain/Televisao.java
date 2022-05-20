package br.com.maria.domain;

import java.io.Serializable;

/**
 * Classe que visa implementar uma Televisao
 * @author ferreira.5903
 * @version 1.0.0
 * @see https://github.com/MariaLuiza07/desenvolvimento1.git
 *
 */
public class Televisao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//public - visivel a quem usar a classe
	//protected - visivel para quem herdar a classe
	//private - visivel apenas dentro da classe
	private Integer tamanhoTela;
	
	private String marca;
	
	private String modelo;
	
	private String voltagem;
	
	public Televisao() {
		
	}
	
	/**
	 * Metodo construtor da Televisao
	 * @param tamanhoTela
	 * @param marca
	 * @param modelo
	 * @param voltagem
	 */
	
	public Televisao(Integer tamanhoTelaExterno) {
		this.tamanhoTela = tamanhoTelaExterno;
	}
	
	public void imprimir() {
		System.out.println("Tamanho Tela: "+tamanhoTela);
	}
	
	//
	//Encapsulamento
	/**
	 * Pega o valor do tamanho da tela
	 * @return tamanhoTela
	 */
	public Integer getTamanhoTela() {
		return this.tamanhoTela;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVoltagem() {
		return voltagem;
	}
	
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	/**
	 * Ajusta o valor da tela.
	 * @param tamanhoTela
	 */
	public void setTamanhoTela(Integer tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public void setVoltagem(int i) {
		// TODO Auto-generated method stub
		
	}

}
