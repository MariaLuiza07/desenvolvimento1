package br.com.maria.domain.internas;

public class Externa {

	private String texto = "Externa";
	
	public void imprimir() {
		System.out.println(texto);
	}
	
	public class Interna {
		private String texto = "Interna";
		
	public void imprimir() {
		System.out.println(Externa.this.texto);
	
		class ClasseImprimir {
			
			public void imprimirInterna() {
				System.out.println("Imprime da classe interna do metodo dentro da classe Interna");
			}
		}
		
		ClasseImprimir cs = new ClasseImprimir();
		cs.imprimirInterna();
	  }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Externa e = new Externa();
		Interna i = e.new Interna();
		e.imprimir();
		i.imprimir();

	}

}
