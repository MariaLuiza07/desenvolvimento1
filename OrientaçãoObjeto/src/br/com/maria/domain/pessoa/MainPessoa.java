package br.com.maria.domain.pessoa;

public class MainPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		manipularPessoaFisica();

	}
	private static void manipularPessoaFisica() {
		
		PessoaFisica pf = new PessoaFisica();
		
		Endereco endereco = new Endereco();
		
		endereco.setEndereco("Rua tal");
		
		endereco.setBairro("Invernada do Matadouro");
		
		endereco.setCidade("Pirai do Sul");
		
		endereco.setUf("PR");
		
		endereco.setPais("Brasil");
		
		Endereco endereco2 = new Endereco();
		
		
		
		// ou
		// pf.getEndereco().setCidade("Castro")
		
		pf.setNome("Maria");
		
		pf.setCidade("Castro");
		
		pf.setCpf("13746605903");
		
		pf.setTipo("TipoPagamentEnum.CADERNO");
		
		pf.imprimir();
	}

}
