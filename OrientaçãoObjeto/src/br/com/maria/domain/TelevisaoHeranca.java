package br.com.maria.domain;

/**
 * @author ferreira.5903
 * @version 1.0.0
 * @since 1.1.2
 * @see https://github.com/MariaLuiza07
 */
public class TelevisaoHeranca {
	
	private Integer tamanhoTela;
	
	private Integer canalAtual;
	
	private Integer ultimoCanal;
	
	private Integer volume;
	
	private Boolean ligada;
	
	public TelevisaoHeranca() {
		
	}

	public TelevisaoHeranca(Integer tamanhoTela) {
		super();
		this.tamanhoTela = tamanhoTela;
	}

	public Integer getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(Integer tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public Integer getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(Integer canalAtual) {
		this.canalAtual = canalAtual;
	}

	public Integer getUltimoCanal() {
		return ultimoCanal;
	}

	public void setUltimoCanal(Integer ultimoCanal) {
		this.ultimoCanal = ultimoCanal;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Boolean getLigada() {
		return ligada;
	}

	public void setLigada(Boolean ligada) {
		this.ligada = ligada;
	}

		
}
