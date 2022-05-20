package br.com.maria.domain;

public class ModeloTV002 extends TelevisaoHeranca implements ControleRemotoInterface {
	
	public static final String MODELO = "TV002";
	
	
	public ModeloTV002() {
		super();
		
	}

	@Override
	public void ligarTV() {
		super.setLigada(true);
		System.out.println("TV Ligada! ");
	}

	@Override
	public void desligarTV() {
		super.setLigada(false);
		System.out.println("TV Desligada! ");
	}

	@Override
	public void trocarCanal(int canal) {
		Integer aux = super.getCanalAtual();
		super.setUltimoCanal(aux);
		super.setCanalAtual(canal);
		System.out.println("Canal "+canal);
	}

	@Override
	public void aumentarVolume(int nivel) {
		Integer volume = super.getVolume();
		volume += nivel;
		super.setVolume(volume);
		System.out.println("Volume "+volume);
	}

	@Override
	public void diminuirVolume(int nivel) {
		Integer volume = super.getVolume();
		volume -= nivel;
		super.setVolume(volume);
		System.out.println("Volume "+volume);
	}

	@Override
	public void voltarUltimoCanal() {
		Integer ultimo = super.getUltimoCanal();
		Integer atual = super.getCanalAtual();
		super.setCanalAtual(ultimo);
		super.setUltimoCanal(atual);
		System.out.println("Canal "+ultimo);
	}

	@Override
	public String toString() {
		return "Modelo ["+MODELO+", Tamanho: " + getTamanhoTela() + ", Canal: " + getCanalAtual()
				+ ", UltimoCanal: " + getUltimoCanal() + ", Volume: " + getVolume() + ", Ligada: "
				+ getLigada();
	}

}
