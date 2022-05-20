/**
 * 
 */
package br.com.maria.domain;

/**
 * Classe Interface do controle remoto
 * @author ferreira.5903
 * @version 1.0.0
 * @see https://github.com/MariaLuiza07
 *
 */
public interface ControleRemotoInterface {

	/**
	 * Liga TV
	 */
	
	public void ligarTV();
	
	/**
	 * Desliga TV
	 */
	public void desligarTV();
	
	/**
	 * Trocar o canal da Tv
	 * 
	 * @param canal - digita o canal a ser assistido
	 */
	public void trocarCanal(int canal);
	
	/**
	 * Aumenta o Volume da TV
	 * 
	 * @param nivel - pontos de volume
	 */
	public void aumentarVolume(int nivel);
	
	/**
	 * Diminui o volume da TV
	 * 
	 * @param nivel - pontos de volume
	 */
	public void diminuirVolume(int nivel);
	
	/**
	 * Volta para ultimo canal assistido
	 */
	public void voltarUltimoCanal();
	
}
