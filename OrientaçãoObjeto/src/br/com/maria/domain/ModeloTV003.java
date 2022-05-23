package br.com.maria.domain;

import java.util.Calendar;

   /**
    * @author ferreira.5903
    * @version 1.0.0
    * @see https://github.com/MariaLuiza07
    * 
    */

public class ModeloTV003 extends TelevisaoHeranca implements ControleRemotoInterface {

	public static final String MODELO = "TV003";
	private ModeloTV003 tv003;
	
	public ModeloTV003() {
		super();
	}

	public void setTv003(ModeloTV003 tv003) {
		System.out.println(tv003);
	}

	public void ligarTV() {
		super.setLigada(true);
		System.out.println("TV Ligada! ");
	}
	
	public void desligarTV() {
		super.setLigada(false);
	    System.out.println("TV Desligada! ");	
	}


	if(tv003 = Ligada) {
		System.out.println("Bom dia!");
	}else if(tv003 = Desligada) {
		System.out.println("Boa tarde!");
	}else {
		System.out.println("Boa noite!");
	}
	
	@Override
	public String toString() {
		return "Modelo ["+MODELO+", Tamanho: " + getTamanhoTela() + ", Canal: " + getCanalAtual()
				+ ", UltimoCanal: " + getUltimoCanal() + ", Ligada: " + getLigada() + "]";
    
   }

}
