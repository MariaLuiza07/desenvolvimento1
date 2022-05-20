package br.com.maria.domain;

public class MainTvs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ModeloTV001 tv001 = new ModeloTV001();
		
		tv001.setTamanhoTela(14);
		
		tv001.setCanalAtual(10);
		
		tv001.setUltimoCanal(20);
		
		tv001.setLigada(false);
		
		System.out.println(tv001.getTamanhoTela());
		System.out.println(tv001.getCanalAtual());
		System.out.println(tv001.getUltimoCanal());
		System.out.println(tv001.getLigada() ? "Ligada" : "Desligada");
		
		ModeloTV002 tv002 = new ModeloTV002();
		
		tv002.setTamanhoTela(39);
		tv002.setCanalAtual(20);
		tv002.setUltimoCanal(10);
		tv002.setLigada(true);
		tv002.setVolume(18);
		
		System.out.println(tv002);
		
		tv002.ligarTV();
		
		for (int i = 0; i < 5; i++) {
			Integer canal = tv002.getCanalAtual();
			canal += 1;
			tv002.trocarCanal(canal);
		}
		
		for (int i = 0; i < 5; i++) {
			tv002.aumentarVolume(1);
		}
		
		for (int i = 10; i > 0; i--) {
			tv002.diminuirVolume(1);
		}
		
		tv002.desligarTV();
		System.out.println(tv002);

	}

}
